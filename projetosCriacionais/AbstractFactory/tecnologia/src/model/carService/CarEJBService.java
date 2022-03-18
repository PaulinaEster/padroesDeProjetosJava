package model.carService;

public class CarEJBService implements CarService{

	@Override
	public void save() {
		System.out.println("Salvando dados do carro");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Fazendo update de dados do carro");
	}

}
