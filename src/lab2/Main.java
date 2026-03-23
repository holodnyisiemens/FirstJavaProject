package lab2;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Person через конструктор
        Person person1 = new Person("Иван", 25, "Мужской");

        // Вывод данных через геттеры
        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());
        System.out.println("Пол: " + person1.getGender());

        // Изменение данных через сеттеры
        person1.setName("Иван Иванов");
        person1.setAge(26);
        person1.setGender("М");

        // Снова выводим, чтобы проверить изменения
        System.out.println("\nПосле изменений:");
        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());
        System.out.println("Пол: " + person1.getGender());

        // Ещё один объект
        Person person2 = new Person("Мария", 30, "Женский");
        System.out.println("\nВторой человек:");
        System.out.println("Имя: " + person2.getName());
        System.out.println("Возраст: " + person2.getAge());
        System.out.println("Пол: " + person2.getGender());

        // Создаём прямоугольник
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Выводим длину и ширину
        System.out.println("Длина: " + rect.getLength());
        System.out.println("Ширина: " + rect.getWidth());

        // Вычисляем площадь и периметр
        System.out.println("Площадь: " + rect.getArea());
        System.out.println("Периметр: " + rect.getPerimeter());

        // Изменяем размеры
        rect.setLength(7.0);
        rect.setWidth(4.0);

        // Снова выводим информацию
        System.out.println("\nПосле изменения размеров:");
        System.out.println(rect); // вызов toString()
    }
}