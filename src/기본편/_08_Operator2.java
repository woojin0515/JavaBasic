package 기본편;

public class _08_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num);  // 12

        num = num - 2;
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2;
        System.out.println(num); // 0
        // 복합 대입 연산자

        num = 10;
        // num = num + 2
        num += 2;
        System.out.println(num);  // 12

        num -= 2;
        System.out.println(num);  // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num);  // 20

        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10

        // num = num % 2;
        num %= 2;
        System.out.println(num); // 0


       }
}
