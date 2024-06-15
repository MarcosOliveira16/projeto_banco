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

    public Pessoa getTitular() {
        return titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
