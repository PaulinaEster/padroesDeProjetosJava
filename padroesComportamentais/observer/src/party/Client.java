package party;

import party.observers.*;
import party.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		doorman.setStatus(false);
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}

}
