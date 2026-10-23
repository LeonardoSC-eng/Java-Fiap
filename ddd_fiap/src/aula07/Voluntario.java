package aula07;

//Não pode ser instanciada diretamente: new Voluntario() gera um erro de compilação
public abstract class Voluntario {

    private String nome;
    private String email;

    public Voluntario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos Concreto: compartilhado por todas as subclasses
    public String getInfor(){
        return "Nome: " + this.nome + " | Email: " + this.email;
    }

    //Métodos Abstratos: Não tem corpo {} (implementação)
    //Obrigam qualquer classe filha concreta a implementar a lógica especifica do método
    public abstract void realizarAcao();
    public abstract double calcularHorasDedicadas();

}
