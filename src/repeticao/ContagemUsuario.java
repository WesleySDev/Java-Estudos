package repeticao;

import java.util.Scanner;
public class ContagemUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = sc.nextInt();
        int contador = 1;

        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
    }
}
