package _05_class._inheritance;

public class Animal {
    private String species;
    private String name;
    private int age;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // 부모 클래스 메서드
    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
