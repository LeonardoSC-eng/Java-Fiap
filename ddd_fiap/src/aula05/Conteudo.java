package aula05;

public class Conteudo {

    private String titulo;
    private String genero;
    private int duracaoMinutos;

    public Conteudo(String titulo, String genero, int duracaoMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        }else {
            System.out.println("Erro: o tempo de duração deve ser positivo");
        }
    }

    //Metodo comum que ambas as filhas herdarão

    public void darPlay(){
        System.out.println("O conteúdo " + this.titulo + " está carregando...");
        System.out.println("Aeeeee, carregando em 3 minutos");
    }

}
