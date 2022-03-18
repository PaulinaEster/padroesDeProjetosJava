package model.certificate;

public class USACertificate implements Certificate{

	@Override
	public String applyCertification() {
		return "Verificando certificados conforme padrões do USA!";
	}

}
