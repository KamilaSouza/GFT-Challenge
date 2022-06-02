package entities;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public double rendimento() {
        return (saldo * 0.03);
    }

    @Override
    public String toString() {
        return "Conta corrente, número: "
                + super.getNumero()
                + ", titular: "
                + super.getNome()
                + ". Seu rendimento mensal foi de: "
                + rendimento()
                + ".";

    }
}
