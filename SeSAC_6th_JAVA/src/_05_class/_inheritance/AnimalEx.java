package _05_class._inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        Dog dog = new Dog("happy", "dog", 10);
        Cat cat = new Cat("nabi", "cat", 6);

        System.out.println("Dog : " + dog.getName() + "/" + dog.getSpecies() + "/" + dog.getAge());
        System.out.println("Cat : " + cat.getName() + "/" + cat.getSpecies() + "/" + cat.getAge());

        dog.fetch();
        dog.makeSound();

        cat.makeSound();
        cat.grooming();
    }
}
