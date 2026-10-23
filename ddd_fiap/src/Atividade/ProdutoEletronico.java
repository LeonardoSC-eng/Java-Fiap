package Atividade;

public class ProdutoEletronico extends Produto {

    private double taxaGarantiaEstendida;

    public ProdutoEletronico(double precoBase, String nome, double taxaGarantiaEstendida) {
        super(precoBase, nome);
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    public double getTaxaGarantiaEstendida() {
        return taxaGarantiaEstendida;
    }

    public void setTaxaGarantiaEstendida(double taxaGarantiaEstendida) {
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase() + (getPrecoBase() * 0.10) + getTaxaGarantiaEstendida();
    }

}
