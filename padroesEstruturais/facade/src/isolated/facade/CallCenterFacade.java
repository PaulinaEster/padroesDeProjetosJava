package isolated.facade;

import isolated.model.Card;
import isolated.services.*;

public class CallCenterFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymantService paymentService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymantService(registerService);
	}
	
	public Long getCardByUser(Long l) {
		Card card = cardService.getCardByUser(l);
		return card.getCardNumber();
	}
	
	public void getSumary(Long cardNumber) {
		reportService.getSumary(new Card(null, cardNumber));
	}
	
	public void getPaymentInfoByCard(Long cardNumber) {
		paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
	}

}
