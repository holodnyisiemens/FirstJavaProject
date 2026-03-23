package lab2;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Геттеры (методы получения значений)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    // Сеттеры (методы установки значений)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) {
        if (age >= 0 && age < 150) { // проверка возраста
            this.age = age;
        }
    }
    public void setGender(String gender) { this.gender = gender; }
}


