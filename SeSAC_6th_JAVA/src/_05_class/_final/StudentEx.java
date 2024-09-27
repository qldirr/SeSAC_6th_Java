package _05_class._final;

public class StudentEx {
    public static void main(String[] args) {
        Student str1 = new Student("s001","김새싹");
        System.out.println(str1.campus);
        System.out.println(str1.sid);
        System.out.println(str1.name);

        // 필드값 수정 시도
        // final 필드는 값 변경 불가(읽기 전용)
//        str1.campus = "마포";
//        str1.sid = "s0001";

        // 인스턴스 필드는 변경 가능
        str1.name = "홍길동";
    }
}
