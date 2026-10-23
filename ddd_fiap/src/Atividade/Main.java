package Atividade;

public class Main {

    public static void main(String[] args){

        Produto p1 = new Produto(10, "Chocolate");
        Produto p2 = new ProdutoEletronico(2000, "Celular", 50);
        Produto p3 = new ProdutoVestuario(50, "Camisa", 15);

        Caixa c = new Caixa();

        c.imprimirEtiqueta(p1);
        c.imprimirEtiqueta(p2);
        c.imprimirEtiqueta(p3);

        c.simularCompraPorCategoria(1, "Notebook Gamer", 4000);
        c.simularCompraPorCategoria(2, "Mouse", 500);

    }

}