package day10.exam02;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUMN) {
			this.volume = RemoteControl.MAX_VOLUMN;
		}
		else if(volume<RemoteControl.MIN_VOLUMN) {
			this.volume = RemoteControl.MIN_VOLUMN;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : " + this.volume);
		
	}
	
	
}
