package entidade;

public class Conta_corrente extends Conta {
    private boolean liberadoPoupanca;

    public Conta_corrente(Pessoa titular) {
        super(titular);
        if (getSaldo() >= 100)
            this.liberadoPoupanca = true;
        else
            this.liberadoPoupanca = false;
       
    }
    @Override
    public String toString() {
        String texto = this.getTitular() + "\nNÚMERO DA CONTA: " + this.getNumConta() + "\nSALDO: " + this.getSaldo();
        return texto;
    }
}