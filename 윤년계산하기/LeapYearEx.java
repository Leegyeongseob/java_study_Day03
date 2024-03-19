package 윤년계산하기;
// 윤년이란? 지구가 태양을 한바퀴 도는데 걸리는 시간이 365일 1/4만큼 소요 되기 때문에
// 일반적으로 4년에 한번씩 2월 29일 존재 (366)
// 윤년의 규칙
// 1. 연도가 4로 나누어 지면 윤년이다.
// 2. 100으로 나누어 지면 윤년이 아님
// 3. 400으로 나누어 지면 윤년

import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위해 스캐너 객체 생성
        System.out.print("연도를 입력 하세요 : ");
        int year = sc.nextInt(); // 정수값을 입력 받아 year 변수에 대입

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "년은 윤년 입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}
