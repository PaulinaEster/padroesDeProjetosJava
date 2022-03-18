package factory;

import model.EJABService.EJABService;
import model.restService.RestService;

public interface ServiceAbstractFactory {
	public EJABService getEJABSerice();
	public RestService getRestService();
}
