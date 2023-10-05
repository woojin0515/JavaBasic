package 기본편;

public class _11_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자 (조건 연산자)
        // 결과 = (조건)? (참의 경우 결과 값) : (거짓의 경우 결과 값)
        int x = 5;
        int y = 3;

        int max = (x > y) ? x : y;
        System.out.println(max);  // x

        int min = (x < y) ? x : y;
        System.out.println(min);  // y

        boolean b = (x == y) ? true : false;
        System.out.println(b);  // false

        b = (x != y) ? true : false;
        System.out.println(b);  // true

        String str = (x != y) ? "달라요" : "같아요";
        System.out.println(str); // 달라요

        x = y;
        str = (x != y) ? "달라요" : "같아요";
        System.out.println(str); // 같아요
    }
}
