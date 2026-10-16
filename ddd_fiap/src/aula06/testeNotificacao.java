package aula06;

public class testeNotificacao {

    //Metodo que aceita QUALQUER Notificação - O coração do Polimorfismo
    public static void dispararAlerta(Notificacao notificacao){
        System.out.println("\n [SISTEMA DE ALERTA]");
        notificacao.enviar(); //O Java decide em tempo de execução qual método enviar() será chamado.
    }

    public static void main(String[] args){

        //Declaração de tipo genérico (Generics) apontando para instâncias especificas
        Notificacao n1 = new Email("Aluno@fiap.com.br ", "CP realizado com sucesso!", "Aviso importante!");
        Notificacao n2 = new SMS("1199999-8888", "AULA de HOJE - Não se Atrase!");

        //Chamada direta
        n1.enviar();
        n2.enviar();

        //Usando o metodo POLIMOFICO com condicionais simples
        //1 - Enviar Email
        //2 - Enviar SMS
        dispararAlerta(n1);
        dispararAlerta(n2);

        //Usando o metodo POLIMORFICO com condicionais
        //1 - Email
        //2 - SMS
        int tipoCanal = 2;
        Notificacao notificacaoEscolhida = null;

        if (tipoCanal == 1){
            notificacaoEscolhida = new Email("aluno2@fiap.com.br", "Alô, TURMA!", "Aula Java");
        }else if (tipoCanal == 2){
            notificacaoEscolhida = new SMS("1199977-1111", "AULA de HOJE - Estamos QUASE terminando...");
        }

        //Não importa o tipo do dado Concreto, o metodo trata TODOS como Notificação
        dispararAlerta(notificacaoEscolhida);

    }
}
