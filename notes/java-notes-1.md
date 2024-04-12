# Intro POO

## classe

- molde/classificacao

O que compoe uma classe?

- "tem": atributos/variaveis
- "faz": metodos/funcoes

como trocar duas variaveis?

```java
int a = 2, b = 3;

int aux = a; // a = 2, b = 3, aux = 2;
a = b; // a = 3, b = 3, aux = 2;
b = aux; // a = 3, b = 2, aux = 2;
```

```java
String[] names = new String[1000];
int[] ages = new int[1000];
double[] heights = new double[1000];
```

melhorando...

```java
public class Pessoa {
  public String name;
  public int age;
  public double heihgt;
}
```

```java
Pessoa joao = new Pessoa();

Pessoa[] pessoas = new Pessoa[1000];
```

## construtores

metodos chamados na inicialização do objeto da classe.

quando nao escrevo nada o construtor padrao é:

```java
public Pessoa() {
}
```

se escrever qualquer construtor este construtor padrao sera deletado:

```java
public Pessoa(String name, int age, double height) {
  this.name = name;
  this.age = age;
  this.height = height;
}
```

sobrecarga de construtor

```java
public class Pessoa {
  public String name;
  public int age;
  public double heihgt;
  public String phoneNumber;

  // no args constructor
  public Pessoa() { 
  }

  // required args constructor
  public Pessoa(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  // all args constructor
  public Pessoa(String name, String phoneNumber, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.phoneNumber = phoneNumber;
  }

}
```

## Modificadores de acesso

`(default)` : é quando não temos nenhum modificador e fica visível apenas dentro do mesmo pacote
`public`: a coisa é visível em todo o projeto
`private` : deixa visivel apenas dentro da classe

## getters and setters

Getters e setters nos ajudam a expor atributos e separar as funcionalidades de acesso e modificação.

> quando fazemos uma classe apenas com getters e setters criamos uma classe anemica ou POJO(Plain Old Java Objects)

```java
public class Account {
  private String holder;
  private double balance;

  // constructors...


  public double getBalance() {
    return balance;
  }

  public double setBalance(double balance) {
    this.balance = balance;
  }

}
```

## Encapsulamento

manter as logicas da classe dentro da classe.

> O contrario do encapsulamento é o acoplamento

```java
public class Account {
  private String holder;
  private double balance;

  // constructors...


  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if(balance < amount) 
      return;

    balance -= amount;
  }

}

```
