# Palavras especiais do java

## `static`

Indica que o atributo é declarado externamente a classe e que não depende de um objeto para ser usado.

Método estático pode ser chamado sem a criação de um objeto.

> Compartilhado

```java
public class Circle {
  public static double pi = 3.14159265;
  private double radius;
  
  // constructor, getters, and setters

  public double getPerimeter() {
    return 2*pi*radius;
  }

  public double getArea() {
    return pi*radius*radius;
  }
}

public class Constraints {
  public static final int DAY_IN_MINUTES = 24 * 60;
}
```

```java
int teste1 = Contraints.DAYS_IN_MINUTES;
double apenasPi = Circle.pi;
```

exemplo de `static` built-in:

```java
Math.sqrt(4);
```

```java
public class CircleUtitilities {

  public static final double PI = 3.14159265;

  public static double calculateArea(double radius) {
    return radius*radius*PI;
  }

}
```

```java
double result = CircleUtils.calculateArea(2.0);
List<Integer> numerois = List.of(1, 2, 3, 4, 5);
LocalDateTime moment = LocalDateTime.of(2024, 04, 24, 07, 35);
Path.of("users", id, "data"); // /users/{id}/data
```

## final

Faz a coisa estar em estado final.

- se for variavel: signfica que nao muda mais de valor
- se for metodo: significa que nao muda mais de implementacao

## @Override

Override signfica sobreescrever.

método especial 'toString', dentro da classe

```java
public String toCsv() {
  return nome + "," + idade + "," + altura
}

@Override
public String toString() {
  return "nome: " + nome
      + ", idade: " + idade 
      + ", altura: " + altura;
}
```

```java
Pessoa p1 = new Pessoa("Joao", 25, 1.7);
Number[] numeros = {1, 2.3, 5, 7.8};

System.out.println(p1); 
// nome: Joao, idade: 25, altura: 1.7 
```

---

```java
List<String> nomesHabilitados = pessoas
  .filter(pessoa -> pessoa.getIdade() >= 18)
  .filter(pessoa -> pessoa.ehHabilitada())
  .map(pessoa -> pessoa.getNome());
```
