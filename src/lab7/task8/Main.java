package lab7.task8;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fileName = "src/lab7/example7/person.ser";
        File file = new File(fileName);

        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите город: ");
        String city = scanner.nextLine();

        Person person = new Person(name, age, city);

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Объект успешно сохранён в файл.");

        } catch (IOException e) {
            System.out.println("Ошибка при сохранении объекта:");
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person restoredPerson = (Person) in.readObject();

            System.out.println("\nОбъект восстановлен из файла:");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());
            System.out.println("Город: " + restoredPerson.getCity());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при чтении объекта:");
            e.printStackTrace();
        }

        scanner.close();
    }

    private static class Person implements Serializable {

        private static final long serialVersionUID = 1L;

        private final String name;
        private final int age;
        private final String city;

        Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        String getCity() {
            return city;
        }
    }
}
