package lab3.task_1;
public class Example_5 {
    static int depth = 0;

    public static void main(String[] args) {
        int result = fact(4);
        System.out.println("Результат = " + result);
    }
    public static int fact(int n) {
        System.out.println(">>> факториал(" + n + ")");
        depth++;
        int result;

        if (n == 0 || n == 1) {
            result = 1;  // 0! = 1, 1! = 1
        } else {
            result = n * fact(n - 1);  // факториал: n! = n * (n-1)!
        }

        depth--;
        System.out.println("<<< факториал(" + n + ") = " + result);
        return result;
    }
}