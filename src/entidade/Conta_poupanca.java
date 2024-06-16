package entidade;

public class Conta_poupanca extends Conta {
    private double taxa_redendimento;

    public Conta_poupanca(Pessoa titular) {
        super(titular);
        taxa_redendimento = 0.0005;

        System.out.println("Conta poupança aberta com sucesso");
        
    }

    public double getTaxa_redendimento() {
        return taxa_redendimento;
    }

    public void Rendimento(int tempo) {
        if (getSaldo() >= 100) {
            System.out.println(
                    "No periodo : " + tempo + " o redimento foi de : "
                            + (getSaldo() * Math.pow((1 + taxa_redendimento), tempo)));
        } else {
            System.out.println("Saldo insuficiente para rendimento;");
        }

    }

    @Override
    public String toString() {
        String texto = this.getTitular() + "\nNÚMERO DA CONTA: " + this.getNumConta() + "\nSALDO: " + this.getSaldo();
        return texto;
    }

}