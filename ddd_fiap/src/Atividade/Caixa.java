package Atividade;

public class Caixa{

    public void imprimirEtiqueta(Produto produto){
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço base: " + produto.getPrecoBase());
        System.out.println("Preço final: " + produto.calcularPrecoFinal());
        System.out.println("-----------------------------");
    }

    public void simularCompraPorCategoria(int opcao, String nome, double precoBase){
        Produto produto;

        if (opcao == 1){
            produto = new ProdutoEletronico(precoBase, nome, 50);
        }else if (opcao == 2){
            produto = new ProdutoVestuario(precoBase, nome, 15);
        }else{
            produto = new Produto(precoBase, nome);
        }

        imprimirEtiqueta(produto);
    }

}