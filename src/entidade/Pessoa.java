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

}
