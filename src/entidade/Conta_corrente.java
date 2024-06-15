package entidade;

public class Conta_corrente extends Conta {
    public Conta_corrente(Pessoa titular, int numConta, double saldo) {
        super(titular, numConta, saldo);

        System.out.println("Conta corrente aberta com sucesso\nDados:");
        System.out.println(titular);
    }
}
