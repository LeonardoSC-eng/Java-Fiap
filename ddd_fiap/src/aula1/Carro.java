package aula1;

public class Carro {

    //atributos - características / informações do objeto
    String marca;
    String modelo;
    String cor;
    int velocitadeAtual;



    //métodos - comportamento/ações

    void acelerar(){
        System.out.println("Acelerando...");
        velocitadeAtual = velocitadeAtual + 10;
        System.out.println("O carro acelerou! Velocidade atual: " + velocitadeAtual + " km/h");
    }

    void frear(){
        System.out.println("Freando...");
        velocitadeAtual = velocitadeAtual - 10;
        System.out.println("O carro acelerou! Velocidade atual: " + velocitadeAtual + " km/h");
    }

}
