import java.util.Random;
import java.util.Scanner;
public class Aula4 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        Scanner lendoNumero = new Scanner(System.in);

        final int sorteio = aleatorio.nextInt(0,10);

        System.out.println("Digite um valor aleatorio para jogar:");

        int numeroDoUsuario = lendoNumero.nextInt();

        System.out.println("Número aleatorio:" + sorteio + " - Número digitado:  " + numeroDoUsuario);

        lendoNumero.close();
    }
}