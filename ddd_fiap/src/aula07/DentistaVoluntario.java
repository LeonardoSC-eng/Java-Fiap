package aula07;

//Dentista DEVE implementar os métodos abstratos da superclasse
public class DentistaVoluntario extends Voluntario {

    private String cro;
    private int consultasRealizadas;

    public DentistaVoluntario(String nome, String email, String cro, int consultasRealizadas) {
        super(nome, email);
        this.cro = cro;
        this.consultasRealizadas = consultasRealizadas;
    }

    @Override
    public void realizarAcao() {
        System.out.println("Realizando atendimento odontológico com o CRO: " + this.cro);
    }

    @Override
    public double calcularHorasDedicadas() {
        return this.consultasRealizadas * 1.5; //Média de atendimento em horas (1.5h por consulta)
    }
}
