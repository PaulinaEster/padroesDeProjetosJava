package factory;

import model.EJABService.EJABCarService;
import model.EJABService.EJABService;
import model.restService.RestCarService;
import model.restService.RestService;

public class CarAbstractFactory implements ServiceAbstractFactory{

	@Override
	public EJABService getEJABSerice() {
		// TODO Auto-generated method stub
		return new EJABCarService();
	}

	@Override
	public RestService getRestService() {
		// TODO Auto-generated method stub
		return new RestCarService();
	}

}
