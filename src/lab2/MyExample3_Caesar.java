package lab2;
import java.util.Scanner;

public class MyExample3_Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        // Шифрование
        String encrypted = Encrypt.getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        // Вопрос про обратное преобразование
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("y")) {
            String decrypted = Encrypt.getEncryptString(encrypted, -key);
            System.out.println("Обратное преобразование: " + decrypted);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }
}
