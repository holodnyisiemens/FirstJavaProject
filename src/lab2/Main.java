package lab2;

public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА 4
        // Создание объекта Person через конструктор
        // Person person1 = new Person("Иван", 25, "Мужской");

        // Вывод данных через геттеры
        // System.out.println("Имя: " + person1.getName());
        // System.out.println("Возраст: " + person1.getAge());
        // System.out.println("Пол: " + person1.getGender());

        // Изменение данных через сеттеры
        // person1.setName("Иван Иванов");
        // person1.setAge(26);
        // person1.setGender("М");

        // Снова выводим, чтобы проверить изменения
        // System.out.println("\nПосле изменений:");
        // System.out.println("Имя: " + person1.getName());
        // System.out.println("Возраст: " + person1.getAge());
        // System.out.println("Пол: " + person1.getGender());

        // Ещё один объект
        // Person person2 = new Person("Мария", 30, "Женский");
        // System.out.println("\nВторой человек:");
        // System.out.println("Имя: " + person2.getName());
        // System.out.println("Возраст: " + person2.getAge());
        // System.out.println("Пол: " + person2.getGender());

        // ЗАДАЧА 5
        // Создаём прямоугольник
        // Rectangle rect = new Rectangle(5.0, 3.0);

        // Выводим длину и ширину
        // System.out.println("Длина: " + rect.getLength());
        // System.out.println("Ширина: " + rect.getWidth());

        // Вычисляем площадь и периметр
        // System.out.println("Площадь: " + rect.getArea());
        // System.out.println("Периметр: " + rect.getPerimeter());

        // Изменяем размеры
        // rect.setLength(7.0);
        // rect.setWidth(4.0);

        // Снова выводим информацию
        // System.out.println("\nПосле изменения размеров:");
        // System.out.println("Длина: " + rect.getLength());
        // System.out.println("Ширина: " + rect.getWidth());
        // System.out.println("Площадь: " + rect.getArea());
        //System.out.println("Периметр: " + rect.getPerimeter());

        // ЗАДАЧА 6
        // Shape circle = new Circle(5);
        // Shape square = new Square(4);
        // Shape triangle = new Triangle(3, 4, 5);

        // System.out.println("Круг:");
        // System.out.println("Площадь = " + circle.getArea());
        // System.out.println("Периметр = " + circle.getPerimeter());

        // System.out.println("\nКвадрат:");
        // System.out.println("Площадь = " + square.getArea());
        // System.out.println("Периметр = " + square.getPerimeter());

        // System.out.println("\nТреугольник:");
        // System.out.println("Площадь = " + triangle.getArea());
        // System.out.println("Периметр = " + triangle.getPerimeter());

        // ЗАДАЧА 7
        // BankAccountInterface account = new BankAccount(1000);
        // System.out.println("Текущий баланс: " + account.getBalance());
        // account.deposit(500);
        // account.withdraw(300);
        // System.out.println("Текущий баланс: " + account.getBalance());

        // ЗАДАЧА 8
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Сухой корм");
        Bird bird = new Bird("Кеша", 1, true);

        dog.makeSound();
        dog.showInfo();
        System.out.println();

        cat.makeSound();
        cat.showInfo();
        System.out.println();

        bird.makeSound();
        bird.showInfo();
    }
}
