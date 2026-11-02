package repeticao;

public class ContagemRegressivaWhile {
    public static void main(String[] args) {

        int i = 5; // Começa no 5

        while(i >= 1) { // Repete enquanto i for maior ou igual a 1
            System.out.println(i); // Mostra o número na tela
            i--; // Diminui 1 do número (evita loop infinito)
        }
    }
}
