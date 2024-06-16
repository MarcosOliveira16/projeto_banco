package entidade;

import java.util.Scanner;

public class App {
    static Scanner sc;

    public static void MenuPrincipal() {
        System.out.println("===== BEM VINDO - BANCO PMW =====");
        System.out.print(
                "1 - Abrir conta\n2 - Acessar conta\n0 - Sair sistema \nR: ");
    }

    public static void MenuAux() {
        System.out.println("====== Menu Contas ======");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta poupança");
        System.out.println("3 - Voltar");
        System.out.print("R: ");
    }

    public static void MenuContaCorrente() {
        System.out.println("====== Menu ======");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Extrato");
        System.out.println("4 - Transferência para conta poupança");
        System.out.println("5 - Dados da conta");
        System.out.println("6 - Voltar");
        System.out.print("R: ");
    }

    public static void MenuContaPoupanca() {
        System.out.println("====== Menu ======");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Extrato");
        System.out.println("4 - Transferência para conta corrente");
        System.out.println("5 - Rendimento conta poupança");
        System.out.println("6 - Dados da conta");
        System.out.println("7 - Voltar");
        System.out.print("R: ");
    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in); // Scanner global
        String nome;
        int idade;
        String cpf;
        int esc;
        double deposito, saque, trans;
        Pessoa pessoa = null;
        Conta_poupanca conta_poup = null;
        Conta_corrente conta_core = null;

        // Menu geral
        do {
            MenuPrincipal();
            esc = sc.nextInt();
            sc.nextLine();
            switch (esc) {
                case 1:
                    if(pessoa !=null){
                        System.out.println("ja existe uma conta criada");
                    }else{
                        System.out.println("===== Cadastramento =====");
                        System.out.print("Informe seu nome:");
                        nome = sc.nextLine();
                        System.out.print("Informe seu CPF: ");
                        cpf = sc.nextLine();
                        System.out.print("Informe sua idade: ");
                        idade = sc.nextInt();
                        

                        pessoa = new Pessoa(nome, idade, cpf); // instanciando pessoa

                        // instanciando contas
                        conta_core = new Conta_corrente(pessoa);
                        conta_poup = new Conta_poupanca(pessoa);

                        // firmando contas
                        pessoa.abrirConta(conta_core, conta_poup);

                        System.out.println("Conta aberta com sucesso.");
                    };
                    break;

                case 2:
                    if (pessoa == null) {
                        System.out.println("Realize primeiro o cadastro!");
                        break;
                    } else {
                        // Menu contas
                        do {
                            MenuAux();
                            esc = sc.nextInt();
                            sc.nextLine();
                            switch (esc) {
                                case 1:
                                    do {
                                        MenuContaCorrente();
                                        esc=sc.nextInt();
                                        switch (esc) {
                                            case 1:
                                                System.out.print("Digite o valor do depósito: ");
                                                deposito = sc.nextDouble();
                                                conta_core.depositar(deposito);
                                                break;
                                            case 2:
                                                System.out.print("Digite o valor do saque: ");
                                                saque = sc.nextDouble();
                                                conta_core.saque(saque);
                                                break;
                                            case 3:
                                                System.out.println("Extrato:");
                                                System.out.println(conta_core.getSaldo()); 
                                                break;
                                            case 4:
                                                System.out.print("Informe o valor da transferência: ");
                                                trans = sc.nextDouble();

                                                if (conta_core.getSaldo() > trans) {
                                                    conta_core.saque(trans);
                                                    conta_poup.depositar(trans);
                                                    System.out.println("Transferência feita com sucesso.");
                                                } else
                                                    System.out.println("Saldo insuficiente.");
                                                break;
                                            case 5 :
                                                System.out.println(conta_core.toString()); 
                                                break;
                                            case 6:
                                                break;
                                            default:
                                                System.out.println("Opcao inválida! corrente");
                                                break;
                                        }
                                    } while (esc != 6);
                                    break;
                                case 2:
                                    do {
                                        MenuContaPoupanca();
                                        esc = sc.nextInt();
                                        switch (esc) {
                                            case 1:
                                                if (conta_core.getSaldo() > 0) {
                                                    System.out.print("Digite o valor do depósito: ");
                                                    deposito = sc.nextDouble();
                                                    conta_poup.depositar(deposito);
                                                } else {
                                                    System.out.println("É necessário ter saldo na conta corrente.");
                                                }
                                                break;
                                            case 2:
                                                System.out.print("Digite o valor do saque: ");
                                                saque = sc.nextDouble();
                                                conta_poup.saque(saque);
                                                break;
                                            case 3:
                                                System.out.println("Extrato:");
                                                System.out.println(conta_poup.getSaldo()); 
                                                break;
                                            case 4:
                                                System.out.print("Informe o valor da transferência: ");
                                                trans = sc.nextDouble();

                                                if (conta_poup.getSaldo() > trans) {
                                                    conta_poup.saque(trans);
                                                    conta_core.depositar(trans);
                                                    System.out.println("Transferência feita com sucesso.");
                                                } else
                                                    System.out.println("Saldo insuficiente.");
                                                break;
                                            case 5:
                                                System.out.print("Informe o tempo que deseja deixar rendendo: ");
                                                int tempo = sc.nextInt();
                                                conta_poup.Rendimento(tempo);
                                                break;
                                            case 6:
                                                System.out.println(conta_poup.toString());
                                                break;
                                            case 7:
                                                break;
                                            default:
                                                System.out.println("Opcao inválida! poupança");
                                                break;
                                        }
                                    } while (esc != 7);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Opcao inválida menu contas");
                                    break;
                            }
                        } while (esc != 3);
                        break;
                    }
                case 0:
                    break;
                default:
                    System.out.println("Opcao inválida menu geral!");
                    break;
            }
        } while (esc != 0);

    }
}