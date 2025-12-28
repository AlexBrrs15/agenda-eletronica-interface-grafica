

public class Contato{
    private String cpf;
    private String nome;
    private String email;
    private String telefone;

    public Contato (String cpf, String nome, String email, String telefone){
        setCpf(cpf);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        
    }

    //getters
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }

    //setters
    public void setCpf(String cpf){
        if(cpf != null && cpf.matches("\\d{11}")){
            this.cpf = cpf;
        }else {
            throw new IllegalArgumentException("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
        }
        
    }
    public void setNome(String nome){
        if(nome != null && !nome.trim().isEmpty()){ 
            this.nome = nome;
        }else {
            throw new IllegalArgumentException("Nome inválido. Não pode ser nulo ou vazio.");   
        }

    }
    public void setEmail(String email){
        if(email != null && email.contains("@")){   
            this.email = email;
        }else {
            throw new IllegalArgumentException("Email inválido. Deve conter um '@'.");
        }
    }

    public void setTelefone(String telefone){
        if(telefone != null && telefone.matches("\\d{10,11}")){
            this.telefone = telefone;
        }else {
            throw new IllegalArgumentException("Telefone inválido. Deve conter 10 ou 11 dígitos numéricos.");
        }
    }
}
