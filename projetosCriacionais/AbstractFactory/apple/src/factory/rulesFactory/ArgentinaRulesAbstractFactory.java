package factory.rulesFactory;

import model.certificate.ArgentinaCertificate;
import model.certificate.Certificate;
import model.pack.ArgentinaPacking;
import model.pack.Packing;

public class ArgentinaRulesAbstractFactory implements CountryRulesAbstractFactory{

	@Override
	public Certificate getCertificates() {
		
		return new ArgentinaCertificate();
	}

	@Override
	public Packing getPacking() {
		return new ArgentinaPacking();
	}

	
	
}
