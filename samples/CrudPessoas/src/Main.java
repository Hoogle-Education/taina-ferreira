import model.Person;

import java.util.Scanner;

public class Main {

    public static void addPerson(Person[] people, int emptyPos, Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        String name = scanner.next();

        System.out.print("Digite o sua idade: ");
        int age = scanner.nextInt();

        System.out.print("Digite o sua altura: ");
        double height = scanner.nextDouble();

        System.out.print("Digite o seu telefone: ");
        String phoneNumber = scanner.next();

        people[emptyPos] = new Person(name, age, height, phoneNumber);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int emptyPos = 0;
        Person[] people = new Person[100];

        addPerson(people, emptyPos, scanner);
        emptyPos++;

        addPerson(people, emptyPos, scanner);
        emptyPos++;
    }
}