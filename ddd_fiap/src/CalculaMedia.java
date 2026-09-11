import java.util.Scanner;

public class CalculaMedia {

    static void main(){

        Scanner input = new Scanner(System.in);

        String nome;
        float n1, n2, n3, media;

        //n1 = 7.8;
        //Esse codigo não funciona por que o codigo sabe que o n1 é float, mas não sabe que o 7.8 é float

        System.out.println(("Nome: "));
        nome = input.nextLine();
        System.out.println(("Nota 1: "));
        n1 = input.nextFloat();
        System.out.println(("Nota 2: "));
        n2 = input.nextFloat();
        System.out.println(("Nota 3: "));
        n3 = input.nextFloat();

        media = (n1+n2+n3)/3;

        System.out.println(nome + ", a sua média foi: " + media);

    }

}
 