package day19.quiz;

public class Button {
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void Click() {
		this.clickListener.onClick();
	}
}
