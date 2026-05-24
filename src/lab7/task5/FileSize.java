package lab7.task5;

import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {

            long size = file.length();

            System.out.println("Размер файла: " + size + " байт");

        } else {
            System.out.println("Файл не найден.");
        }

        scanner.close();
    }
}