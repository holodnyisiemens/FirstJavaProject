package lab3.task_2;
import java.util.Scanner;
public class Num_System {
    public static String convertToBase2(int val) {
        if (val == 0) {
            return "";
        }
        return convertToBase2(val / 2) + (val % 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для перевода в двоичную систему: ");
        int num = input.nextInt();
        String result;

        if (num == 0) {
            result = "0";
        } else {
            result = convertToBase2(num);
        }

        System.out.println("Результат: " + result);
        input.close();
    }
}