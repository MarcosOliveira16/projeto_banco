package entidade;

public class Conta {
    protected Pessoa titular;
    protected int numConta;
    protected double saldo;

    public Conta(Pessoa titular) {
        this.numConta = (int)(Math.random()*(9999-1000))-1000;
        this.saldo = 0;
        addTitular(titular);
    }
    public void addTitular(Pessoa titular) {
        this.titular = titular;
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
        String texto = this.titular + "\nNÚMERO DA CONTA: " + this.numConta + "\nSALDO: " + this.saldo;
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

    
}
