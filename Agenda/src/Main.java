public class Main {

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        Contato contato1 = new Contato("12345678901", "Alice Silva", "aa@gmail", "11987654321");
        Contato contato2 = new Contato("09876543210", "Bruno Souza", "bb@gmail", "21912345678");

        minhaAgenda.cadastrarContato(contato1);
        minhaAgenda.cadastrarContato(contato2);

        minhaAgenda.buscarContato("12345678901");
        minhaAgenda.excluirContato(1);

        
    }
}