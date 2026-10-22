package repeticao;

import java.util.Scanner;
public class SenhaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        int senha = sc.nextInt();

        while (senha != 1234 ) {
            System.out.println("Digite a senha correta: ");
            senha = sc.nextInt();



        }
        System.out.println("Senha correta!");

    }
}
