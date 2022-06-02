// Resolution of question 1:

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new ContaPoupanca(10, "Kamila", 1000);
        System.out.println(conta1.toString());

        Conta conta2 = new ContaCorrente(11, "Pedro", 1000);
        System.out.println(conta2.toString());

    }
}
