package factory;

import model.carService.CarEJBService;
import model.carService.CarService;
import model.userService.UserEJBService;
import model.userService.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory{

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		// TODO Auto-generated method stub
		return new CarEJBService();
	}

}
