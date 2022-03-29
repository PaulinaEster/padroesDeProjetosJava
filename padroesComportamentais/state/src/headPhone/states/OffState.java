package headPhone.states;

import headPhone.HeadPhone;

public class OffState implements HPState{
	private static final HPState instance = new OffState();
	
	private OffState() {}
	
	public static HPState getInstance() {
		return instance;
	}
	
	@Override
	public void click(HeadPhone hp) {}

	@Override
	public void longClick(HeadPhone hp) {
		hp.setOn(true);
		System.out.println("> Turning On");
		hp.setState(OnState.getInstance());
	}

}
