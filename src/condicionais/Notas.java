package condicionais;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        System.out.println("Qual foi sua nota?");
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
