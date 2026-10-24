package Atividade2310;

public class Main {

    public static void main(String[] args){

        //Doacao d1 = new Doacao();
        //d1.calcularTaxaAdministrativa();

        DoacaoDinheiro dd = new DoacaoDinheiro(13, "Leonardo", 2000, "Pix");
        DoacaoSuprimento ds = new DoacaoSuprimento(23, "Lucas", 150, 10);

        emitirComprovante(dd);
        emitirComprovante(ds);

    }

    public static void emitirComprovante(Doacao d){
        System.out.println("---COMPROVANTE---");
        System.out.println(d.exibirResumo());
        d.processarDoacao();
        System.out.println("Valor base: R$" + d.getValorBase());
        System.out.println("Taxa administrativa: R$" + d.calcularTaxaAdministrativa());
        System.out.println("Total: R$"+ (d.getValorBase() + d.calcularTaxaAdministrativa()));
        System.out.println("---------------------\n");
    }

}