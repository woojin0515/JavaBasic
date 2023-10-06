package 기본편;

public class _12_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        // 포함되어 있지 않을 때
        System.out.println(s.contains("Kotlin")); // false
        System.out.println(s.indexOf("Java")); // 위치 정보
        // 포함되어 있지 않을 때
        System.out.println(s.indexOf("Kotlin")); // -1
        // 중복될 때
        System.out.println(s.indexOf("and")); // 기본적으로 처음 일치하는 위치 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치 정보 (23)
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true 아니면 false
    }
}
