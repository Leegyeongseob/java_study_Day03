package 디폴트메소드;

public interface RemoteControl {
    final static int MAX_VOLUME = 100; // final static이 자동 추가
    /// 기능명세에 허용 값을 기존에 기재하는 방법.
    int MIN_VOLUME = 0;
    void turnON(); // public abstract가 자동 붙음.
    void turnOFF();
    void SetVolume(int volume);
    ///디폴트 메소드 추가 : jDK 8(2011년 이후 추가됨.)
    // 8,11,17버젼 : LTS 버전(유지보수가 오랫동안 가능.)

    default void SetMute(boolean mute){
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    // 사용와중에 고객의 피드백으로 기능을 추가할 때 abstract 선언만 하면 관련 객체들에서 전부 기능을 강제로 만들어야 한다.
    // 기존의 인터페이스의 영향을 받는 객체들이 모두 에러가(구현필수) 난다. interface에서 기능을 구현해줘야 한다.
    // 다중상속 문제는 자바에서 내부적으로 해결했다.


    //static울 사용하면 RemoteControl 인터페이스 소속이므로 메소드 구현 가능.
    static void changeBattery(){
        System.out.println("건전지를 교화 합니다.");
    }
    //디폴트와 스테틱의 차이?

}
