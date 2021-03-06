package factory.rulesFactory;

import model.certificate.BrazilianCertificate;
import model.certificate.Certificate;
import model.pack.BrazilianPacking;
import model.pack.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}
	
	public Packing getPacking() {
		
		return new BrazilianPacking();
	}
}
