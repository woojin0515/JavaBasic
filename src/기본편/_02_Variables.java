package 기본편;

public class _02_Variables {
    public static void main(String[] args) {
        String name = "최우진";
        int h = 15;
        System.out.println(name + "님, 안녕하세요. " + h + "번째 방문이시군요");
        System.out.println(name + "님, 안녕히가세요.");

        double score = 95.5;
        char grade = 'A';

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;


        System.out.println(d);
        System.out.println(f);

        long l = 10_000_000_000_000L;
        System.out.println(l);

        /*int, long, float, double, char, String, boolean*/
    }
}
