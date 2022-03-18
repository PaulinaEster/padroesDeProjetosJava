package factory.rulesFactory;

import model.certificate.Certificate;
import model.pack.Packing;

public interface CountryRulesAbstractFactory {
	public Certificate getCertificates();
	
	public Packing getPacking();
	
}
