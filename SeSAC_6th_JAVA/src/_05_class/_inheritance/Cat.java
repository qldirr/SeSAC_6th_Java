package _05_class._inheritance;

public class Cat extends Animal{
    public Cat(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    void makeSound(){
        System.out.println("야옹!!");
    }

    public void grooming(){
        System.out.println("그루밍 중....");
    }
}
