package Atividade2310;

public class DoacaoDinheiro extends Doacao{

    private String meioPagamento;

    public DoacaoDinheiro(int id, String doador, double valorBase, String meioPagamento) {
        super(id, doador, valorBase);
        this.meioPagamento = meioPagamento;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    @Override
    public double calcularTaxaAdministrativa() {
        return this.getValorBase() * 0.02;
    }

    @Override
    public void processarDoacao() {
        System.out.println("\nProcessando doação via " + this.meioPagamento + "...");
    }
}
