package 기본편;

public class _07_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);  // 덧셈 값: 6
        System.out.println(4 - 2);  // 뺄셈 값: 2
        System.out.println(4 * 2);  // 곱셈 값: 8
        System.out.println(4 / 2);  // 나눗셈 값: 2
        System.out.println(4 % 2);  // 나머지 값: 0
        System.out.println(5 / 2);  // 2
        System.out.println(5 % 2);  // 1
        System.out.println(2 / 4);  // 0
        System.out.println(2 % 4);  // 2

        //우선 순위 연산
        System.out.println(2 + 2 * 2);  // 곱셈, 나눗셈 연산 우선
        System.out.println((2 + 2) * 2); // 괄호 우선

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c);  // 10

        c = a * b;
        System.out.println(c);  // 200

        c = a / b;
        System.out.println(c);  // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); //10

        // 번호표
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++);  // 0
        System.out.println("대기 인원: " + waiting++);  // 1
        System.out.println("대기 인원: " + waiting++);  // 2
        System.out.println("총 대기 인원: " + waiting); // 3

        // 변수 뒤에 증감 연산이 사용되면 앞에 명령부터 실행되어 연산이 된 체로 출력 되지 않는다.
        }
}
