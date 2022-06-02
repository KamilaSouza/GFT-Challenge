import entities.Doenca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Doenca> doenças = new ArrayList<>();
        System.out.println("Entre com o sintoma: ");
        String resposta = scanner.nextLine();

        if (doenças.contains(resposta)){
            System.out.println("Seu sintoma pode ser de: " + doenças);
        } else {
            System.out.println("Não foi possivel encontrar uma doença pelos sintomas informados.");
        }
    }
}
