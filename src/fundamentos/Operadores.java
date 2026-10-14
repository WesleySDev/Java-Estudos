package fundamentos;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 6;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.print("Soma: " + soma + ", Subtração: " + subtracao +
                ", Multiplicação: " + multiplicacao + ", Divisão: " + divisao +
                ", Resto: " + resto);
    }
}
