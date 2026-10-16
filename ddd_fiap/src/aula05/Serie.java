package aula05;

public class Serie extends Conteudo{

    private int totalTemporadas;

    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0) {
            this.totalTemporadas = totalTemporadas;
        }else{
            System.out.println("ERRO: não foi possivel definir a TEMPORADA");
        }
    }

    public void exibirDetalhes(){
        System.out.println("=== EXIBIR DETALHES DA SERIE ===");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.getTotalTemporadas());
    }

}
