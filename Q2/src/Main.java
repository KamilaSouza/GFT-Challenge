import entities.Animal;
import entities.SerVivo;
import entities.Vegetal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 se o ser vivo é um animal ou digite 2 se o ser vivo é um vegetal:");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            SerVivo serVivo = new Vegetal();
            System.out.println("Seu ser vivo é um vegetal e respira: " + serVivo.getRespira() + ".");
        } else if (resposta == 2) {
            SerVivo serVivo = new Animal();
            System.out.println("Seu ser vivo é um animal e respira: " + serVivo.getRespira() + ".");
        } else {
            System.out.println("Favor inserir uma opção válida!");
        }

    }
}
