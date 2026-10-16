package condicionais;
import  java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastro selecionado");
                break;

            case 2:
                System.out.println("Consulta selecionada");
                break;


            case 3:
                System.out.println("Saindo...");
                break;


            default:
                System.out.println("Opção inválida");
        }
    }
}
