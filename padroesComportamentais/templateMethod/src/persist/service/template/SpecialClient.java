package persist.service.template;

import persist.model.Cart;

public class SpecialClient extends BestOfferTemplate {

	public SpecialClient(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return cart.getBuyer().isSpecialClient();
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.85d;
		deliveryFactor = 0.5d;
	}

}
