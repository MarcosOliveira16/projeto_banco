package entidade;

public class Conta_poupanca extends Conta {
    private double taxa_redendimento;

    public Conta_poupanca(Pessoa titular,int numConta, double saldo){
        super(titular, numConta,saldo);
        taxa_redendimento = 0.0005;
    }

    public double getTaxa_redendimento() {
        return taxa_redendimento;
    }
    public void Rendimento(int tempo){
        if(saldo>=100){
            System.out.println("No periodo : "+tempo+ " foi de : "+ (saldo*Math.pow((1+taxa_redendimento),tempo)) );
        }else{
            System.out.println("Saldo insuficiente para rendimento;");
        }

    }   

}
