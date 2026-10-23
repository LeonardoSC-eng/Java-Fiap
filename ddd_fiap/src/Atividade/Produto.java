package Atividade;

public class Produto {

    private String nome;
    private double precoBase;

    public Produto(double precoBase, String nome) {
        this.precoBase = precoBase;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal(){
        return getPrecoBase();
    }

}
