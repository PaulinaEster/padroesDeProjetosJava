package callCenter.service;

import java.util.*;

import callCenter.model.*;

public class RegisterService {
	private Map<Long, List<Register>> memory;
	
	public RegisterService() {
		memory = new HashMap<Long, List<Register>>();
		memory.put(11223344L, new ArrayList<>(Arrays.asList(
				new Register("McDonalds", 15d, new Date()),
				new Register("Pizza Hut", 25d, new Date()),
				new Register("Nike Store", 50d, new Date())
			)));
	}

	public List<Register> getRegistersByCard(Card card) {
		return memory.get(card.getCardNumeber());
	}

	public void removeByIndex(Card card, int i) {
		List<Register> list = memory.get(card.getCardNumeber());
		Register reg = list.remove(i);
		System.out.println(reg.toString() + " Deleted!");
		memory.put(card.getCardNumeber(), list);
	}

	public void deleteCardRegistries(Card card) {
		memory.remove(card.getCardNumeber());
	}
	
	public void addCardRegisters(Card card, List<Register> registers) {
		System.out.println("Associating pending Registers to new Card!");
		memory.put(card.getCardNumeber(), registers);
	}
}
