package aplicacao;

import java.util.Scanner;

import entidade.Conta;
import entidade.Conta_corrente;
import entidade.Conta_poupanca;
import entidade.Pessoa;

public class App {
    static Scanner sc; // Scanner global

    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Porfirio", 22, "123.456.789-12");
        Pessoa pessoa2 = new Pessoa("Beiton", 21, "987.654.321-98");

        System.out.println("Exibição pessoas: ");
        System.out.println(pessoa1);
        System.out.println("\n" + pessoa2);

        Conta conta_corrente1 = new Conta_corrente(pessoa1, 13245, 98.00);
        Conta conta_corrente2 = new Conta_corrente(pessoa2, 56987, 100.00);
        Conta conta_poupanca1 = new Conta_poupanca(pessoa1, 13245, 98.00);
        Conta conta_poupanca2 = new Conta_poupanca(pessoa2, 56987, 100.00);

        System.out.println("\nExibição contas: ");
        System.out.println(conta_corrente1);
        System.out.println("\n" + conta_corrente2);


        // testando 
        
    }
}
