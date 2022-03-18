package factory;

import model.carService.CarService;
import model.userService.UserService;

public interface ServicesAbstractFactory {
	public UserService getUserService();
	public CarService getCarService();
}
