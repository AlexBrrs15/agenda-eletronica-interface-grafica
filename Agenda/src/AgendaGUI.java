import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class AgendaGUI extends JFrame{
    private JTextField txtCpf, txtNome, txtEmail, txtTelefone;
    private JTable tabela;
    private DefaultTableModel modelo;
    private Agenda agenda = new Agenda();

    public AgendaGUI(){
        setTitle("Agenda de Contatos");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Painel de entrada de dados
        JPanel painelEntrada = new JPanel(new GridLayout(5,2,5,5));
        painelEntrada.setBorder(BorderFactory.createTitledBorder("Dados de entrada"));

        
        painelEntrada.add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        painelEntrada.add(txtCpf);

        painelEntrada.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        painelEntrada.add(txtNome);

        painelEntrada.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        painelEntrada.add(txtEmail);

        painelEntrada.add(new JLabel("Telefone:"));
        txtTelefone = new JTextField();
        painelEntrada.add(txtTelefone);

        JButton botaoAdicionar = new JButton("Cadastrar");
        JButton botaoRemover = new JButton("Excluir");

        painelEntrada.add(botaoAdicionar);
        painelEntrada.add(botaoRemover);


        //Tabela de contatos
        modelo = new DefaultTableModel(new Object[]{"CPF", "Nome", "Email", "Telefone"}, 0);
        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);

        //Adiciona componentes à janela
        add(painelEntrada, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //Ações dos botões
        botaoAdicionar.addActionListener(e -> adicionarContato());
        botaoRemover.addActionListener(e -> RemoverContato());
    }

    //Método para adicionar contato
    private void adicionarContato(){
        try {

            Contato contato = new Contato(
                txtCpf.getText(),               
                txtNome.getText(),
                txtEmail.getText(),
                txtTelefone.getText()
            );

            
            agenda.cadastrarContato(contato);

            modelo.addRow(new Object[]{
                contato.getCpf(),
                contato.getNome(),
                contato.getEmail(),
                contato.getTelefone()
            });
            
            limparCampos();


        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Método para remover contato
    private void RemoverContato(){
        int linhaSelecionada = tabela.getSelectedRow();

        if(linhaSelecionada >= 0){
            agenda.excluirContato(linhaSelecionada);
            modelo.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um contato para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Método para limpar campos de entrada
    private void limparCampos(){
        txtCpf.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            AgendaGUI gui = new AgendaGUI();
            gui.setVisible(true);
        });
    }
    
}