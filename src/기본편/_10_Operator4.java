package 기본편;

public class _10_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);  // 하나라도 참이라면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);  // 모두가 참이여야 true

        // AND 연산
        System.out.println((5 > 3) && (3 > 1));  // true
        System.out.println((5 > 3) && (3 < 1));  // false

        // OR 연산
        System.out.println((5 > 3) || (3 < 1)); // OR 연산자이기 때문에 하나라도 만족하니 true
        System.out.println((5 < 3) || (3 < 1)); // 하지만 하나라도 만족하지 못한다면 false

        // System.out.println(1 < 3 < 5);
        System.out.println((1 < 3) && (3 < 5));

        // 논리 부정 연산자
        System.out.println(!true); // true 의 반대 (false)
        System.out.println(!false); // false 의 반대 (true)
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
