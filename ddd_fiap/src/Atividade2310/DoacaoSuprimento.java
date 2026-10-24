package Atividade2310;

public class DoacaoSuprimento extends Doacao{

    private double pesoKg;

    public DoacaoSuprimento(int id, String doador, double valorBase, double pesoKg) {
        super(id, doador, valorBase);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularTaxaAdministrativa() {
        return this.pesoKg * 5;
    }

    @Override
    public void processarDoacao() {
        System.out.println("\nAgendando triagem e transporte para " + this.pesoKg + "kg de suprimentos");
    }

}
