package day10.exam02;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "검색합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
		
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
