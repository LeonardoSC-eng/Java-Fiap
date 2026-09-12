package aula2;

public class TelevisaoTeste {

    public static void main(String[] args){

        System.out.println("--- Minha Televisão ---");

        //Criação do objeto Televisao
        Televisao tv = new Televisao();

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Canal: " + tv.getVolume());
        System.out.println("Canal: " + tv.getLigado());

        //Alterando os dados do objeto tv (de forma direta)
        //tv.canal = 30;
        tv.setCanal(100);
        //tv.volume = 100;
        tv.setVolume(60);
        //tv.ligado = true;
        tv.setLigado(true);

        System.out.println("----------------------------");

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Canal: " + tv.getVolume());
        System.out.println("Canal: " + tv.getLigado());

    }
}
