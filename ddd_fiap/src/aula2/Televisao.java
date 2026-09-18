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
        this.canal = canal;
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

}
