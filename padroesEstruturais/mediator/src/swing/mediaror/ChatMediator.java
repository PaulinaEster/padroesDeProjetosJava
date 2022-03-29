package swing.mediaror;

import swing.model.User;

public class ChatMediator extends Mediator {
	@Override
	public String getMessage(String message, User to, User from) {
		return message;
	}
 
}