# Documentação do Projeto Banco PMW

## Sumário
1. [Introdução](#introdução)
2. [Estrutura do Projeto](#estrutura-do-projeto)
3. [Classes Principais](#classes-principais)
    - [App](#class-app)
    - [Pessoa](#class-pessoa)
    - [Conta](#class-conta)
    - [Conta_corrente](#class-conta_corrente)
    - [Conta_poupanca](#class-conta_poupanca)
4. [Menus e Navegação](#menus-e-navegação)
5. [Compilação e Execução](#compilação-e-execução)
6. [Considerações Finais](#considerações-finais)

## Introdução

O projeto Banco PMW é um sistema de gerenciamento bancário que permite a abertura de contas correntes e contas poupança, além de possibilitar operações bancárias básicas como depósito, saque, extrato e transferências entre contas. O sistema foi implementado em Java e utiliza uma interface de linha de comando para interação com o usuário.

## Estrutura do Projeto

O projeto está organizado em pacotes e classes da seguinte maneira:

```
/src
  /entidade
    - Pessoa.java
    - Conta.java
    - Conta_corrente.java
    - Conta_poupanca.java
  - App.java
```

## Classes Principais

### Classe `App`

A classe `App` contém o método `main` e gerencia a interação do usuário com o sistema por meio de menus. Ela é responsável por executar as operações principais como abrir contas e acessar contas existentes.

#### Métodos

- `public static void MenuPrincipal()`: Exibe o menu principal do sistema.
- `public static void MenuAux()`: Exibe o menu de seleção de tipos de conta.
- `public static void MenuContaCorrente()`: Exibe o menu de operações da conta corrente.
- `public static void MenuContaPoupanca()`: Exibe o menu de operações da conta poupança.
- `public static void main(String[] args)`: Método principal que inicia a execução do programa e gerencia a navegação entre os menus.

### Classe `Pessoa`

A classe `Pessoa` representa uma pessoa titular de conta no banco.

#### Atributos

- `private String nome`: Nome da pessoa.
- `private int idade`: Idade da pessoa.
- `private String CPF`: CPF da pessoa.
- `private Conta_corrente conta_corrente`: Referência à conta corrente da pessoa.
- `private Conta_poupanca conta_poupanca`: Referência à conta poupança da pessoa.

#### Métodos

- `public Pessoa(String nome, int idade, String CPF)`: Construtor que inicializa os atributos da pessoa.
- `public String getNome()`: Retorna o nome da pessoa.
- `public int getIdade()`: Retorna a idade da pessoa.
- `public String getCPF()`: Retorna o CPF da pessoa.
- `public Conta_corrente getContaCorrente()`: Retorna a conta corrente da pessoa.
- `public Conta_poupanca getContaPoupanca()`: Retorna a conta poupança da pessoa.
- `public String toString()`: Retorna uma representação textual da pessoa.
- `public void abrirConta(Conta_corrente conta1, Conta_poupanca conta2)`: Atribui as contas corrente e poupança à pessoa.

### Classe `Conta`

A classe `Conta` é uma classe base para os tipos de conta no banco.

#### Atributos

- `protected Pessoa titular`: Titular da conta.
- `protected int numConta`: Número da conta.
- `protected double saldo`: Saldo da conta.

#### Métodos

- `public Conta(Pessoa titular)`: Construtor que inicializa o titular e define um número de conta aleatório.
- `public void addTitular(Pessoa titular)`: Define o titular da conta.
- `protected Pessoa getTitular()`: Retorna o titular da conta.
- `protected int getNumConta()`: Retorna o número da conta.
- `protected double getSaldo()`: Retorna o saldo da conta.
- `public String toString()`: Retorna uma representação textual da conta.
- `protected void depositar(double deposito)`: Adiciona um valor ao saldo da conta.
- `protected void saque(double saque)`: Subtrai um valor do saldo da conta, se houver saldo suficiente.

### Classe `Conta_corrente`

A classe `Conta_corrente` herda de `Conta` e adiciona funcionalidades específicas para contas correntes.

#### Atributos

- `private boolean liberadoPoupanca`: Indica se a conta corrente pode transferir fundos para a conta poupança.

#### Métodos

- `public Conta_corrente(Pessoa titular)`: Construtor que inicializa a conta corrente e define a possibilidade de transferir para poupança com base no saldo.
- `public String toString()`: Retorna uma representação textual da conta corrente.

### Classe `Conta_poupanca`

A classe `Conta_poupanca` herda de `Conta` e adiciona funcionalidades específicas para contas poupança.

#### Atributos

- `private double taxa_redendimento`: Taxa de rendimento da conta poupança.

#### Métodos

- `public Conta_poupanca(Pessoa titular)`: Construtor que inicializa a conta poupança e define a taxa de rendimento.
- `public double getTaxa_redendimento()`: Retorna a taxa de rendimento.
- `public void Rendimento(int tempo)`: Calcula e exibe o rendimento da conta poupança com base no tempo.
- `public String toString()`: Retorna uma representação textual da conta poupança.

## Menus e Navegação

O sistema utiliza menus para navegar entre as opções disponíveis. Os menus são exibidos por métodos específicos na classe `App` e permitem ao usuário realizar operações como abrir conta, acessar contas e realizar transações.

### Menu Principal

Exibe opções para abrir conta, acessar conta ou sair do sistema.

```java
public static void MenuPrincipal() {
    System.out.println("===== BEM VINDO - BANCO PMW =====");
    System.out.print("1 - Abrir conta\n2 - Acessar conta\n0 - Sair sistema \nR: ");
}
```

### Menu de Seleção de Contas

Permite escolher entre conta corrente e conta poupança.

```java
public static void MenuAux() {
    System.out.println("====== Menu Contas ======");
    System.out.println("1 - Conta corrente");
    System.out.println("2 - Conta poupança");
    System.out.println("3 - Voltar");
    System.out.print("R: ");
}
```

### Menu de Conta Corrente

Permite realizar operações na conta corrente.

```java
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
```

### Menu de Conta Poupança

Permite realizar operações na conta poupança.

```java
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
```

## Compilação e Execução

Para compilar e executar o projeto, siga os passos abaixo:

1. Compile todas as classes:
    ```sh
    javac src/entidade/*.java src/App.java -d bin
    ```

2. Execute a aplicação:
    ```sh
    java -cp bin entidade.App
    ```

## Considerações Finais

O projeto Banco PMW oferece uma solução simples e eficiente para o gerenciamento de contas bancárias. Através de menus interativos, os usuários podem realizar operações básicas de maneira intuitiva. Melhorias futuras podem incluir a persistência de dados e uma interface gráfica para uma experiência de usuário aprimorada.
