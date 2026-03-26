package lab2;

// базовый класс
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() { System.out.println("Животное издает звук"); }
    public void showInfo() { System.out.println("Имя: " + name + ", Возраст: " + age); }
}

class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() { System.out.println(name + " говорит: Гав"); }

    @Override
    public void showInfo() { super.showInfo(); System.out.println("Порода: " + breed); }
}

class Cat extends Animal {
    private String foodType;
    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() { System.out.println(name + " говорит: Мяу"); }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Еда: " + foodType);
    }
}

class Bird extends Animal {
    private boolean canFly;
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() { System.out.println(name + " говорит: Чирик"); }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Умеет летать: " + (canFly ? "Да" : "Нет"));
    }
}
