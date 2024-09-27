package _05_class._inheritance;

public class Dog extends Animal {
    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    // 메서드 오버라이딩
    // 부모 클래스의 makeSound 메서드 재정의
    @Override
    void makeSound(){
        super.makeSound();   // 부모 메서드 호출
        System.out.println("멍멍!!");
    }

    // 자식 클래스에만 존재하는 추가 메서드
    void fetch(){
        System.out.println("공 가져와!");
    }
}

// 부모 메서드 호출
// 메서드 재정의 : 부모 메서드는 숨겨지고 자식 메서드만 사용됨(부모 메서드의 일부만 변경되더라도 중복된 내용을 자식 메서드도 가지고 있어야함)
// ex. 부모 메서드가 100줄의 코드를 가지고 있다면 자식 메서드에서 한줄만 추가하고 싶어도 100 줄 코드를 다 써야함
// 자식 메서드와 부모 메서드의 공동 작업 처리 기법을 사용하면 쉽게 가능(즉 자식 메서드 내에서 부모 메서드 호출)
// ex. super.METHOD() : 숨겨진 부모 메서드 호출