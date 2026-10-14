package entradaDados;

import java.util.Scanner;

public class ScannerBasico {
    public static void main(String[] args) {
        System.out.println("Qual é seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Qual é sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Qual é sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Você está estudando? ");
        boolean estudando = sc.nextBoolean();

        System.out.println("Ola " + nome + "!");
        System.out.println("Você tem " + idade);
        System.out.println("Sua altura é " + altura);
        System.out.println("Você esta estudando? " + estudando);

        sc.close();
    }
}
