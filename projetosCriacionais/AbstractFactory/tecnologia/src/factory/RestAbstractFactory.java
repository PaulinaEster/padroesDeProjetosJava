package factory;

import model.carService.CarRestService;
import model.carService.CarService;
import model.userService.UserRestService;
import model.userService.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory{

	@Override
	public UserService getUserService() {
		// TODO Auto-generated method stub
		return new UserRestService();
	}

	@Override
	public CarService getCarService() {
		// TODO Auto-generated method stub
		return new CarRestService();
	}

}
