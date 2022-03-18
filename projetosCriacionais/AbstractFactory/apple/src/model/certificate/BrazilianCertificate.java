package model.certificate;

public class BrazilianCertificate implements Certificate{

	@Override
	public String applyCertification() {
		return "Verificando certificaods conforme padrões Anatel";
	}

}
