import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args){
        Scanner leitorTxt = new Scanner(System.in);
        
        System.out.println("Seu nome é:\n");
        String nome = leitorTxt.nextLine();
        System.out.println("Colaborador 01\n" + nome);

        System.out.println("Seu nome é:\n");
        String nome2 = leitorTxt.nextLine();
        System.out.println("Colaborador 02\n" + nome2);

        System.out.println("Seu nome é:\n");
        String nome3 = leitorTxt.nextLine();
        System.out.println("Colaborador 03\n" + nome3);

        System.out.println("Seu nome é:\n");
        String nome4 = leitorTxt.nextLine();
        System.out.println("Colaborador 04\n" + nome4);

        
        System.out.println("Seu nome é:\n");
        String nome5 = leitorTxt.nextLine();
        System.out.println("Colaborador 05\n" + nome5);

    }
}

/* Faça um sistema em java para a leitura 
    dos nomes de 5 colaborador e em seguida 
    mostre o nome digitado desses funcionarios
 */