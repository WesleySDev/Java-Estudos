package condicionais;
import java.util.Scanner;
public class PermissaoDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual valor da compra?");
        double valorCompra = sc.nextDouble();

        System.out.println("É cliente vip? ");
        boolean clienteVIP = sc.nextBoolean();


        if ((clienteVIP && valorCompra >= 50) || (!clienteVIP && valorCompra >= 200)) {
            System.out.println("Desconto aprovado");
        } else {
            System.out.println("Desconto recusado");
        }
    }
}