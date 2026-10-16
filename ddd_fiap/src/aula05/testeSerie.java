package aula05;

public class testeSerie {

    public static void main(String[] args){

        Filme meuFilme = new Filme("Interestelar", "Ficção Cientifica", 170, true);
        meuFilme.exibirDetalhes();
        meuFilme.darPlay();


        Serie minhaSerie = new Serie("Breaking bad", "Drama", 45, 5);
        minhaSerie.exibirDetalhes();
        minhaSerie.darPlay();

    }



}