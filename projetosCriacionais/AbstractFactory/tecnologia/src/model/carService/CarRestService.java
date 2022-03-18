package model.carService;

public class CarRestService implements CarService{

	@Override
	public void save() {
		System.out.println("Salvando dados do carro pela Rest");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Fazendo update de dados do carro pela Rest");
	}

}
