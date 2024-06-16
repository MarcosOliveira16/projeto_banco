package entidade;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;
    private Conta conta;
    

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

    public Conta getConta() {
        return conta;
    }

    public String toString() {
        return "NOME: " +
                nome +
                "\nIDADE: " +
                idade +
                "\nCPF: " +
                CPF;
    }

    public void abrirConta(Conta conta) {
        this.conta = conta;
        conta.addTitular(this); // pega o objeto atual e jogar na classe 'Conta'
    }
}