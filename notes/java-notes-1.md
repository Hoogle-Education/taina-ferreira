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
