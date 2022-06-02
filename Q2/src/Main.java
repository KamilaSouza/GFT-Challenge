import entities.Animal;
import entities.SerVivo;
import entities.Vegetal;

import java.util.Locale;
import java.util.Scanner;

//Resolution of question 2:
//2. Ser vivo (vale 2 pontos)
//        Crie um programa que tenha uma classe SerVivo com um atributo respira, uma
//        classe Vegetal cujo atributo respira retorna “CO2” e outra Animal cujo atributo
//        respira retorna “O2” que herdem de SerVivo. Crie um método que receba um objeto
//        SerVivo e retorne o valor do atributo respira.
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
