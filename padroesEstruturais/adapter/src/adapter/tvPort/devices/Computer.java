package adapter.tvPort.devices;

import adapter.tvPort.interfaces.HDMI;

public class Computer{
	private HDMI port;
	
	public void connectPort(HDMI screen) {
		System.out.println("Connectiong on HDMI port... ");
		this.port = screen;
	}
	
	public void sendImageAndSound(String image, String sound) {
		if(port == null) {
			System.out.println("Connect a HDMI cable first");
		} else {
			port.setImagem(image);
			port.setSound(sound);
		}
	}
	

}
