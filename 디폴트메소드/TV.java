package 디폴트메소드;

public class TV implements RemoteControl{

    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void SetVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume > RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
            System.out.println("현제 Audio 볼륨 :" + this.volume);
        }
    }

    @Override
    public void SetMute(boolean mute) {
//       RemoteControl.super.SetMute(mute);
        if(mute) System.out.println("오디오를 무음으로 처리합니다.");
        else System.out.println("오디오 소리를 켭니다.");
    }
}

