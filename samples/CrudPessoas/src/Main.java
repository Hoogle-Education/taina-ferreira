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

    public static void updateAllByName(Person[] people, int emptyPos, Scanner scanner) {
        System.out.print("Busque por um nome para atualizar seus campos: ");
        String nameToSearch = scanner.nextLine();
        Person personToUpdate = null;

        for(int i = 0; i < emptyPos; i++) {
            Person person = people[i];
            String personNameIngoreCase = person.getName().toUpperCase();

            if(personNameIngoreCase.contains(nameToSearch.toUpperCase())) {
                personToUpdate = person;
                break;
            }
        }

        if(personToUpdate == null) {
            System.out.println("Nenhuma pessoa para atualizar encontrada com esse nome");
            return;
        }

        System.out.println("Pessoa encontrada: " + personToUpdate);
        System.out.print("Confirma que deseja atualizar os campos dessa pessoa? (s/n): ");

        String yesOrNoOption = scanner.nextLine();

        if (yesOrNoOption.equalsIgnoreCase("n")) {
            System.out.println("Atualizacao cancelada.");
            return;
        }

        if(!yesOrNoOption.equalsIgnoreCase("s")) {
            System.out.println("Opcao invalida");
            System.out.println("Atualizacao cancelada.");
            return;
        }

        System.out.print("Digite o novo nome: ");
        personToUpdate.setName(scanner.nextLine());

        System.out.print("Digite a sua nova idade: ");
        personToUpdate.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite a sua nova altura: ");
        personToUpdate.setHeight(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Digite o seu novo telefone: ");
        personToUpdate.setPhoneNumber(scanner.nextLine());
    }

    public static boolean deleteByName(Person[] people, int emptyPos, Scanner scanner) {
        System.out.print("Busque por um nome para deletar: ");
        String nameToDelete = scanner.nextLine();
        int personToRemoveIndex = -1;

        for(int i = 0; i < emptyPos; i++) {
            Person person = people[i];
            String personNameIngoreCase = person.getName().toUpperCase();

            if(personNameIngoreCase.contains(nameToDelete.toUpperCase())) {
                personToRemoveIndex = i;
                break;
            }
        }

        if(personToRemoveIndex == -1) {
            System.out.println("Nenhuma pessoa para deletar encontrada com esse nome");
            return false;
        }

        System.out.println("Pessoa encontrada: " + people[personToRemoveIndex]);
        System.out.print("Confirma que deseja deletar essa pessoa? (s/n): ");

        String yesOrNoOption = scanner.nextLine();

        if (yesOrNoOption.equalsIgnoreCase("n")) {
            System.out.println("Atualizacao cancelada.");
            return false;
        }

        if(!yesOrNoOption.equalsIgnoreCase("s")) {
            System.out.println("Opcao invalida");
            System.out.println("Atualizacao cancelada.");
            return false;
        }

        people[personToRemoveIndex] = null;

        for(int i = personToRemoveIndex + 1; i < emptyPos; i++) {
            people[i] = people[i+1];
        }

        return true;
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
                case 4 -> updateAllByName(people, emptyPos, scanner);
                case 5 -> {
                    boolean isDeleted = deleteByName(people, emptyPos, scanner);
                    if(isDeleted) emptyPos--;
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