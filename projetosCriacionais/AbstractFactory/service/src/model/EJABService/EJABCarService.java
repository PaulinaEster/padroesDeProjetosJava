package model.EJABService;

public class EJABCarService implements EJABService{

	@Override
	public String save() {
		// TODO Auto-generated method stub
		return "Dados do carro salvo na EJAB";
	}

	@Override
	public void delete() {
		System.out.println("Deletado com sucesso!");
	}

}
