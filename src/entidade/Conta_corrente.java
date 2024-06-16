package entidade;

public class Conta_corrente extends Conta {
    private boolean liberadoPoupanca;

    public Conta_corrente() {
        if (getSaldo() >= 100)
            this.liberadoPoupanca = true;
        else
            this.liberadoPoupanca = false;

        System.out.println("Conta corrente aberta com sucesso\nDados:");
        System.out.println(titular.getConta().toString());
    }

    @Override
    public String toString() {
        String texto = this.getTitular() + "\nNÚMERO DA CONTA: " + this.getNumConta() + "\nSALDO: " + this.getSaldo();
        return texto;
    }
}
