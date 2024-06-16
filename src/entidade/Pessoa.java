package entidade;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;
    private Conta_corrente conta_corrente;
    private Conta_poupanca conta_poupanca;
    

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;

        System.out.println("Cadastro realizado com sucesso");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public Conta_corrente getContaCorrente() {
        return conta_corrente;
    }

    public Conta_poupanca getContaPoupanca() {
        return conta_poupanca;
    }

    public String toString() {
        return "NOME: " +
                nome +
                "\nIDADE: " +
                idade +
                "\nCPF: " +
                CPF;
    }

    public void abrirConta(Conta_corrente conta1, Conta_poupanca conta2) {
        this.conta_corrente = conta1;
        this.conta_poupanca = conta2;
    }
}