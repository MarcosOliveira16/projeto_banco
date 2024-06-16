package aplicacao;

import java.util.Scanner;

import entidade.Conta;
import entidade.Conta_corrente;
import entidade.Conta_poupanca;
import entidade.Pessoa;

public class App {
    public static Scanner sc = new Scanner(System.in); // Scanner global

    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        String cpf;
        int esc;
        Pessoa pessoa;
        Conta conta;

        System.out.println("Hello, World!");
        while(true){
            System.out.println("Banco");
            System.out.println("Bem Vindo");
            System.out.println( "Cadastramento");
            System.out.println("Informe seu Nome");
            nome =sc.nextLine();
            System.out.println("Informe sua Idade");
            idade =sc.nextInt();
            System.out.println("Informe seu CPF");
            cpf =sc.next();
            pessoa =new Pessoa(nome,idade,cpf);
            System.out.println("Menu");
            System.out.println("1--Abrir uma conta poupança");
            System.out.println("2--Abrir uma conta corrente");
            esc= sc.nextInt();
            while (true) {
                switch (esc) {
                    case 1:
                        conta = new Conta_poupanca();
                        conta.addTitular(pessoa);
                        break;
    
                    case 2:
                        conta = new Conta_corrente();
                        break;    
                    
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
                break;
            }
            
        }
        
    }
}
