package adapter.tvPort.devices;

import adapter.tvPort.interfaces.HDMI;

public class TV implements HDMI{

	@Override
	public void setImagem(String image) {
		System.out.println(" >>> This is your video:  " + image);
		
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
		
	}

}
