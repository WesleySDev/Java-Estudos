package condicionais;
import java.util.Scanner;
public class Desconto {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual valor da compra? ");
        double valorCompra = sc.nextDouble();

        System.out.println("É cliente VIP? ");
        boolean clienteVIP =  sc.nextBoolean();


        //verificação mais simples boolean ( || ClienteVIP)
        if (valorCompra >= 100 || clienteVIP) {
            System.out.println("Desconto aplicado");
        }else {
            System.out.println("Desconto não aplicado");
        }

    }
}
