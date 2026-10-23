package aula07;

public class MainVoluntario {

    public static void main(String[] args){

        //1. Tentar instanciar a classe abstrata
        //Voluntario v = new Voluntario("Ana", "ana@email.com");

        //2. Criando instâncias das classes concretas
        DentistaVoluntario dentista = new DentistaVoluntario("Dra. Maria","maria@email.org", "SP-13456", 3);
        EducadorVoluntario educador = new EducadorVoluntario("Pedro", "pedro@remail.org", 2);

        //3. Executando os métodos de FORMA DIRETA
//        System.out.println("--- VOLUNTARIO 1 ---");
//        System.out.println(dentista.getInfor());
//        dentista.realizarAcao();
//        System.out.println("Horas: " + dentista.calcularHorasDedicadas() + "h\n");
//
//        System.out.println("--- VOLUNTARIO 2 ---");
//        System.out.println(educador.getInfor());
//        educador.realizarAcao();
//        System.out.println("Horas: " + educador.calcularHorasDedicadas() + "h\n");

        //O mesmo metodo imprimirRelatorio aceita qualquer filho de Voluntário
        imprimirRelatorio(dentista);
        imprimirRelatorio(educador);

    }

    //Metodo polimorfico: recebe a classe ABSTRATA como parâmetro
    public static void imprimirRelatorio(Voluntario v){
        System.out.println("--- RELATÓRIO ---");
        System.out.println(v.getInfor());
        v.realizarAcao(); //Executa o comportamento específico da sup classe
        System.out.println("Horas: " + v.calcularHorasDedicadas() + "h\n");
        System.out.println("------------------------------\n");
    }

}
