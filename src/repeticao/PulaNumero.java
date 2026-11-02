package repeticao;

public class PulaNumero {
    public static void main (String[] args ){

        int contador  = 1; // Começa no 1

        while(contador <= 10){ // Vai até 10

            if (contador == 5){ // Quando for igual a 5...
                contador++;     // Avança para o 6...
                continue;       // ...e pula para a próxima repetição do loop
            }

            System.out.println(contador); // Mostra o número na tela

            contador++; // Avança o número normalmente nos outros casos
        }
    }
}
