package repeticao;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;

        // Loop que repete 5 vezes para ler os números
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            // Verifica e atualiza se o número atual for o maior de todos
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println(maior);
    }
}
