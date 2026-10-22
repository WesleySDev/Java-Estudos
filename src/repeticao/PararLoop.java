package repeticao;

public class PararLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);

            if (i == 5) {
                break; // Interrompe o loop imediatamente
            }

            i++; // Incrementa a variável de controle
        }
    }
}
