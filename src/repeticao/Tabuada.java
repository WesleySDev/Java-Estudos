// Define o pacote onde a classe está organizada
package repeticao;

// Declara a classe principal chamada Tabuada
public class Tabuada {

    // Método principal que inicia a execução do programa
    public static void main(String[] args){

        // Loop que começa em 1 e vai até 10, aumentando de 1 em 1
        for (int i = 1; i <= 10; i++){

            // Calcula o resultado multiplicando 5 pelo número atual do loop (i)
            int tabuada = 5 * i;

            // Mostra o resultado formatado na tela (Ex: 5 x 1 = 5)
            System.out.println(" 5 " + "x " + i + " = " + tabuada);
        }
    }
}
git