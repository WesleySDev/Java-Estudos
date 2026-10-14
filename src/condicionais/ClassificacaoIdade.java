package condicionais;

import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        System.out.println("Qual é sua idade?");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        }

        sc.close();
    }
}
