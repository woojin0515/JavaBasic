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
    }
}
