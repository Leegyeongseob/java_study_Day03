package 매개변수의다형성;

import java.util.Scanner;

public class TypeCastEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("구입 할 제품 입력(TV[1] Computer[2] Audio[3] 종료[4]) : ");
            int selNumber = sc.nextInt();
            switch (selNumber) {
                case 1:
                    System.out.println("TV를 구입 합니다.");
                    buyer.buy(tv); break;
                case 2:
                    System.out.println("Computer 를 구입 합니다.");
                    buyer.buy(computer); break;
                case 3:
                    System.out.println("Audio 를 구입 합니다.");
                    buyer.buy(audio); break;
                case 4:
                    buyer.viewInfo();
                    return;
                default: break;
            }
        }
    }
}

class Product {
    int price;
    int bonusPoint;
}
class TV extends Product {
    String name;
    TV() {
        this.name = "My TV";
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}