package factory.rulesFactory;

import model.certificate.Certificate;
import model.certificate.USACertificate;
import model.pack.Packing;
import model.pack.USAPacking;

public class USARulesAbstractFactory implements CountryRulesAbstractFactory{
	public Certificate getCertificates() {
		return new USACertificate();
	}
	
	public Packing getPacking() {
		return new USAPacking();
	}
}
