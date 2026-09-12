package aula2;

/**
 * Encapsulamento
 * - private
 * - protected*
 * - public
 */

public class Televisao {

    private int canal;
    private int volume;
    private boolean ligado = false;

    //Métodos de acesso - getters()
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        if(ligado){
            if(canal >= 0 && canal <=500) {
                this.canal = canal;
                System.out.println("Canal alterado para: "+ this.canal);
            }else{
                System.out.println("[Erro]: Canal invalido!");
            }
        }else{
            System.out.println("[AVISO]: A TV está desligada!");
        }
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        //Aqui ele está invertendo, se a tv estava ligada, ela desliga e vise-versa
        this.ligado = !this.ligado;
        if(ligado){
            System.out.println(">>> TV Ligada!");
        }else{
            System.out.println(">>> TV Desligada!");
        }
    }

}
