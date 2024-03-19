package 디폴트메소드;
import java.util.Scanner;


// 디폴트 메소드란 ? 인터페이스에 있는 구현 메서드를 의미
// 메소드 앞에 default 예약어 사용
// { } 구현부가 존재해야 함.
// 디폴트메소드가 왜 존재해야 할까???

public class DefaultMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl remoteControl;
        System.out.println("원하시는 기계를 골라주세요: [1]TV , [2]Audio");
        int sel = sc.nextInt();
        if(sel == 1){
            remoteControl = new TV();
            remoteControl.turnON();
            remoteControl.SetVolume(20);
            remoteControl.SetMute(true);
            RemoteControl.changeBattery();
            // 표현하기(절차가 복잡하다.) 불편하다 : 익명클래스
            // 클래스 만들고 상속받고 아이고 복잡하다. 한번만 쓸껀데....
        }
        else{
            remoteControl = new Audio();
            remoteControl.turnOFF();
            RemoteControl.changeBattery();
        }

        //익명 클래스 바로 선언하기..
        RemoteControl rc = new RemoteControl() {
            private  int volume;

            @Override
            public void turnON() {
                System.out.println("플레이스테이션5를 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("플레이스테이션5를 끕니다.");

            }

            @Override
            public void SetVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume > RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                    System.out.println("현제 Audio 볼륨 :" + this.volume);
                }
            }
        };
    }
}
