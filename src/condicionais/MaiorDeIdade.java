package condicionais;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        System.out.println("Qual é sua idade?");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        sc.close();
    }
}
