package Atividade;

public class ProdutoVestuario extends Produto{

    private double percentualDesconto;

    public ProdutoVestuario(double precoBase, String nome, double percentualDesconto) {
        super(precoBase, nome);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() - ((getPrecoBase() * getPercentualDesconto()) / 100);
    }
}
