package swing.mediaror;

import swing.model.User;
import swing.service.Translator;

public class TranslatorMediator extends Mediator{

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
