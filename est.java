class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the Animal class
    }

    // @Override
    public void eat() {
        System.out.println(name + " the dog is eating");
    }

    public void bark() {
        System.out.println(name + " the dog is barking");
    }
}

public class est {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
