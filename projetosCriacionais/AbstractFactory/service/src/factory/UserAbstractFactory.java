package factory;

import model.EJABService.EJABService;
import model.EJABService.EJABUserService;
import model.restService.RestService;
import model.restService.RestUserService;

public class UserAbstractFactory implements ServiceAbstractFactory{

	@Override
	public EJABService getEJABSerice() {
		// TODO Auto-generated method stub
		return new EJABUserService();
	}

	@Override
	public RestService getRestService() {
		// TODO Auto-generated method stub
		return new RestUserService();
	}

}
