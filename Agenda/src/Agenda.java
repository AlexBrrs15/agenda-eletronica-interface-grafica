import java.util.List;
import java.util.ArrayList;


public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public List<Contato> getContatos(){
        return new ArrayList<>(contatos);
        
    }


    public void cadastrarContato(Contato contato) {
        if(contato != null){
           contatos.add(contato); 
        }
        
    } 

    public Contato buscarContato(String cpf){
        for(Contato contato : contatos){
            if(contato.getCpf().equals(cpf)){
                return contato;
            }
        }
        return null;

        
    }
    
    public void excluirContato(int index){
        
        if(index >= 0 && index < contatos.size()){
            contatos.remove(index);
        }
    }
}