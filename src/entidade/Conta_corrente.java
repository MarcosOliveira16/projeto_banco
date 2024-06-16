package entidade;

public class Conta_corrente extends Conta {
    private boolean liberadoPoupanca;

    public Conta_corrente(Pessoa titular, int numConta, double saldo) {
        super(titular, numConta, saldo);
        if (saldo >= 100)
            this.liberadoPoupanca = true;
        else
            this.liberadoPoupanca = false;

        System.out.println("Conta corrente aberta com sucesso\nDados:");
        System.out.println(titular.getConta().toString());
    }
}
