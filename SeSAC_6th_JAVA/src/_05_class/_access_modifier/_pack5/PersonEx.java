package _05_class._access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("Minion");
        Person p2 = new Person("Pooh");

        p1.setAge(4);   // setter를 이용해 간접적으로 변경
        System.out.println(p1.getName() + "의 나이 : " + p1.getAge());

        p2.setAge(-10);
        System.out.println(p2.getName() + "의 나이 : " + p2.getAge());
    }
}
