package aula3;

public class TesteCarro {

    public static void main(String[] args){

        Carro c1 = new Carro();

        c1.ExibirTudo();

        System.out.println("__________");


        Carro c2 = new Carro("fiat", "uno", 2012);

        c2.ExibirTudo();

        System.out.println("------Setters------");

        c2.setCor("Vermelho");
        c2.setValor(35000);

        c2.ExibirTudo();

        System.out.println("__________");


        Carro c3 = new Carro("Porshe", "Exportivo", 2020, "preto", 2200000);
        c3.ExibirTudo();

    }

}
