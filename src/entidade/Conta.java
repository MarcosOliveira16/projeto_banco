package entidade;

public class Conta {
    protected Pessoa titular;
    protected int numConta;
    protected double saldo;

    public Conta(Pessoa titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

}
