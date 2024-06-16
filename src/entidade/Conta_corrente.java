package entidade;

public class Conta_corrente extends Conta {
    private boolean liberadoPoupanca;
    //private String []extrato = new String[99999];

    public Conta_corrente(Pessoa titular) {
        super(titular);
        if (getSaldo() >= 100)
            this.liberadoPoupanca = true;
        else
            this.liberadoPoupanca = false;
    }


}