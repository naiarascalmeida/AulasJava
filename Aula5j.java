import java.util.Random;
import java.util.Scanner;

public class Aula5j {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1,6);

        // Obtendo valores com o usuario
        System.out.println("Digite um numero");
        int numero = leitura.nextInt(), pontuacao=30;

        // Teste de pontuação 
        if (numero == sorteio) {
            System.out.println("Você acertou com" + pontuacao + "pontos");
            leitura.close();
            return;
        } else {
            pontuacao = pontuacao -10;
            System .out.println("Você perdeu" + 10 + "pontos e está com" + pontuacao + "pontos");
            leitura.close();
            
        }
    }
}



                /*if (numero == sorteio) {
            System.out.println("Acertou");
            leitura.close();
            return;
        }

        System.out.println("Digite um numero");
        numero = leitura.nextInt();
        if (numero == sorteio) {
            System.out.println("Acertou");
            leitura.close();
            return;
        }

        

        leitura.close();
    }

}
*/