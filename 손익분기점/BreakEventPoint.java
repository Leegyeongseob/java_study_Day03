package 손익분기점;
import java.util.Scanner;
// 손익분기점 : 총 수입이 총 비용보다 많아서 이익이 발생하는 지점을 의미
public class BreakEventPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt(); // 고정 비용
        int varCost = sc.nextInt(); // 가변(생산) 비용
        int sellPrice = sc.nextInt(); // 판매 금액
        if(varCost >= sellPrice) { // 가변 비용이 판매금액과 같거가 크면 절대 이익이 발생 할 수 없음
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost / (sellPrice - varCost)) + 1);
    }
}
