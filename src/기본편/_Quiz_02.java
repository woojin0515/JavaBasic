package 기본편;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;

        /* 입력 받아 활용
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        */

        String s = (120 < height) ? "탑승 가능합니다" : "탑승 불가능합니다";

        System.out.println("키가 " + height + "cm 이므로 " + s);

    }
}
