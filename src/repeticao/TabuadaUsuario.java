package repeticao;
import java.util.Scanner;
public class TabuadaUsuario {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int tabuadaUsuario = sc.nextInt();
        for (int i = 1; i <= 10; i++){
                int resultado = tabuadaUsuario * i;

            System.out.println(tabuadaUsuario + " x " + i + " = " + resultado);

        }
    }
}
