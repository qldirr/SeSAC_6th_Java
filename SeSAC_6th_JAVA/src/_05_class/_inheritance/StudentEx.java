package _05_class._inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student("김새싹", 20);
        // case1. 부모/자식 클래스의 필드가 public
//
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.campus);    // campus 필드는 setter를 이용해 추가되도록 작성됨
//
//        // Person 으로 부터 상속받은 메서드 호출
//        s1.say();
//        s1.eat("banana");
//
//        // Student 메서드 호출
//        s1.setCampus("영등포");
//        System.out.println(s1.campus);

        //////////////////////////////////////////////////////////////////////////////////////////////

        // case2. 부모/자식 클래스의 필드가 private
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCampus());

        // Person 으로 부터 상속받은 메서드 호출
        s1.say();
        s1.eat("banana");

        // Student 메서드 호출
        s1.setCampus("영등포");
        System.out.println(s1.getCampus());
    }
}
