package day10.exam02;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV전원을 킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다");
		
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
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}
	
}
