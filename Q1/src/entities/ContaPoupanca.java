package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public double rendimento() {
        return (saldo * 0.05);
    }

    @Override
    public String toString() {
        return "Conta poupança, número: "
                + super.getNumero()
                + ", titular: "
                + super.getNome()
                + ". Seu rendimento mensal foi de: "
                + rendimento()
                + ".";
    }

}
