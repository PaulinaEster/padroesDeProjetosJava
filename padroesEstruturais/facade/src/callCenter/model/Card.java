package callCenter.model;

public class Card {
	private Long userNumber;
	private Long cardNumeber;
	public Card(Long userNumber, Long cardNumeber) {
		super();
		this.userNumber = userNumber;
		this.cardNumeber = cardNumeber;
	}
	public Long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}
	public Long getCardNumeber() {
		return cardNumeber;
	}
	public void setCardNumeber(Long cardNumeber) {
		this.cardNumeber = cardNumeber;
	}
	@Override
	public String toString() {
		return "Card [userNumber=" + userNumber + ", cardNumeber=" + cardNumeber + "]";
	}
}
