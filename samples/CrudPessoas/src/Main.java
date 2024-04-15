import model.Person;

import java.util.Scanner;

public class Main {

    public static void addPerson(Person[] people, int emptyPos, Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite o sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o sua altura: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o seu telefone: ");
        String phoneNumber = scanner.nextLine();

        Person personToAdd = new Person(name, age, height, phoneNumber);
        System.out.println();
        System.out.println("Sera adicionada: " + personToAdd);
        System.out.println();
        people[emptyPos] = personToAdd;
    }

    public static void showAll(Person[] people, int emptyPos) {
        System.out.println();
        System.out.println("-----------------------------");
        for (int i = 0; i < emptyPos; i++) {
            System.out.println("#" + (i+1) + " - " + people[i]);
        }
        System.out.println("-----------------------------");
        System.out.println();
    }

    public static void searchByName(Person[] people, int emptyPos, Scanner scanner) {
        System.out.print("Digite o nome que deseja buscar: ");
        String nameToSerch = scanner.next();

        for (int i = 0; i < emptyPos; i++) {
            Person person = people[i];
            String personNameIgnoreCase = person.getName().toUpperCase();

            if(personNameIgnoreCase.startsWith(nameToSerch.toUpperCase())) {
                System.out.println(people[i]);
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 - para listar todos");
        System.out.println("2 - para buscar por nome");
        System.out.println("3 - para criar nova pessoa");
        System.out.println("4 - para atualizar");
        System.out.println("5 - para deletar");
        System.out.println("0 - para sair");
        System.out.print("> digite sua opcao: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int emptyPos = 0;
        Person[] people = new Person[100];

        int option;

        // do..while = verifica...interage
        // while = verifica...interage

        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> showAll(people, emptyPos);
                case 2 -> searchByName(people, emptyPos, scanner);
                case 3 -> {
                    addPerson(people, emptyPos, scanner);
                    emptyPos++;
                }
            }
        } while(option != 0);

    }
}

//public static boolean isVowel(char c) {
//    return switch (c) {
//        case 'a', 'e', 'i', 'o', 'u' -> true;
//        default -> false;
//    };
//}