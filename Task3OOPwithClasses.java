class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getType() {
        return "Animal";
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "...";
    }

    public String describe() {
        return getType() + "(" + name + "): " + speak();
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}

public class Task3OOPwithClasses {
    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        Animal d = new Dog("Buddy");
        Animal c = new Cat("Luna");

        Animal[] animals = { a, d, c };
        for (Animal animal : animals) {
            System.out.println(animal.describe());
        }
    }
}