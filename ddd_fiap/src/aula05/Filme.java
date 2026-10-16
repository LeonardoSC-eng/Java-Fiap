package aula05;

public class Filme extends Conteudo {

    private boolean indicacaoOscar;

    public Filme(String titulo, String genero, int duracaoMinutos, boolean indicacaoOscar){
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }

    public boolean getIndicacaoOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(boolean indicacaoOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }

    public void exibirDetalhes(){
        System.out.println("=== EXIBIR DETALHES DO FILME ===");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar){
            System.out.println("Filme INDICADO para o OSCAR");
        }else{
            System.out.println("Filme NAO foi INDICADO para o OSCAR!");
        }
    }

}
