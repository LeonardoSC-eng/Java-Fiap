package aula1;

public class CarroTeste {

    public static void main(String[] args){

        //System.out.println("Hello World");

       //cariando o objeto carro1 do tipo Carro
        Carro carro1 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Azul";
        carro1.velocitadeAtual = 0;

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade Atual: " + carro1.velocitadeAtual);

        System.out.println("\n------------------------------------------------\n");

        Carro carro2 = new Carro();
        carro2.marca = "Jeep";
        carro2.modelo = "Compass";
        carro2.cor = "Preta";
        carro2.velocitadeAtual = 0;

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Velocidade Atual: " + carro2.velocitadeAtual);

        System.out.println("\n------------------------------------------------\n");

        System.out.println("Ações do carro " + carro1.modelo);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println("Velocidade Atual: " + carro1.velocitadeAtual);

        carro1.frear();
        carro1.frear();
        carro1.frear();
        System.out.println("Velocidade Atual: " + carro1.velocitadeAtual);

    }

}
