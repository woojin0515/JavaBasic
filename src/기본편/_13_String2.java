package 기본편;

public class _13_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // "and" 를 "," 로 변환
        System.out.println(s.substring(7)); // index 7 번째 부터 출력
        System.out.println(s.substring(s.indexOf("Java"))); // Java 부터 시작
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 시작과 끝 (끝 바로 직전까지만 잘라냄)

        // 공백 제거
        s = "          I love Java.            ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));

    }
}
