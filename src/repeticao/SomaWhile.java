package repeticao;

public class SomaWhile {
    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        while ( contador <= 5) {


            soma += contador;
            contador++;
        }
        System.out.println(soma);
    }
}
