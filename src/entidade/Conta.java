package entidade;

public class Conta {
    private Pessoa titular;
    private int numConta;
    private double saldo;

    public Conta(Pessoa titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    protected Pessoa getTitular() {
        return titular;
    }

    protected int getNumConta() {
        return numConta;
    }

    protected double getSaldo() {
        return saldo;
    }

    public String toString() {
        String texto = titular + "\nNÚMERO DA CONTA: " + numConta + "\nSALDO: " + saldo;
        return texto;
    }

    protected void depositar(double deposito) {
        saldo += deposito;
    }

    protected void saque(double saque) {
        if (saldo < saque) {
            System.out.println("Saldo insuficiente ");
        } else {
            saldo -= saque;
        }
    }

    protected void addTitular(Pessoa titular) {
        this.titular = titular;
    }
}
