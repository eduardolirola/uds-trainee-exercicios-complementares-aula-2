package aula02.exercicio05;
import java.util.Random;
import java.util.Scanner;

public class JogoParOuImpar {
    static Integer aposta = null;
    static Integer usuario = 100;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.print("Você tem " + usuario + " pontos!" + "\n|1| IMPAR     |2| PAR\nESCOLHA A OPÇÃO: ");
        Scanner scanner = new Scanner(System.in);
        aposta = scanner.nextInt();
        verificaJogo();
    }

    public static void verificaJogo() {
        Random random = new Random();
        int numero = random.nextInt(99);
        if (numero % 2 == 0 && aposta % 2 == 0) {
            System.out.println("RESPOSTA CORRETA!  VOCE ACABA DE GANHAR 10 PONTOS  o/\n");
            usuario += 10;
            menu();
        } else if (numero % 2 != 0 && aposta % 2 != 0){
            System.out.println("RESPOSTA CORRETA! VOCE ACABA DE GANHAR 10 PONTOS  o/\n");
            usuario += 10;
            menu();
        } else {
            System.out.println("RESPOSTA INCORRETA ! VOCE ACABA DE PERDER 10 PONTOS :(\n");
            usuario -= 10;
            menu();
        }
    }
}