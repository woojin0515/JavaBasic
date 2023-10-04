package 기본편;

public class _06_TypeCasting {
    public static void main(String[] args) {
        // 형변환이란? 정수형에서 실수형 or 실수형에서 정수형으로 형을 변환해주는 것

        // int to float and double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        //float and double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98      버림

        // 정수 + 실수 연산
        score = 93 + (int)98.8;  // 93 + 98
        System.out.println(score);  // 191

        score_d = 93 + 98.8; //93 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)

        // int covertedScoreInt = score_d;
        int covertedScoreInt = (int) score_d; // 191.8 -> 191
        System.out.println(covertedScoreInt);
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로 형변환
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        // String s1 = String.valueOf(93); or s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2= Double.toString(98.8);
        // String s2 = String.valueOf(98.8); or s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로 형변환
        int i = Integer.parseInt("93");
        System.out.println(i);  // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // int error = Integer.parseInt("최우진");  따옴표 안에 데이터가 올바른지 확인
    }
}
