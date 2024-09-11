import java.util.Scanner;

public class Aula5 {

    public static void main(String[] args) {
        double medía;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite sua média");
        medía = leitura.nextDouble(); 
        if (medía>6) {
            System.out.println("Aprovado na disciplina");
        }
        leitura.close();
    }

}