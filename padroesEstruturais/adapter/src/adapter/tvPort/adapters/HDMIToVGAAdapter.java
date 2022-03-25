package adapter.tvPort.adapters;

import adapter.tvPort.interfaces.HDMI;
import adapter.tvPort.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI{

	private VGA vga;
	
	
	
	public HDMIToVGAAdapter(VGA vga) {
		super();
		System.out.println("Connnectiong the HDMI/VGA adapter...");
		this.vga = vga;
	}

	@Override
	public void setImagem(String image) {
		System.out.println("Converting the image from HDMI to VGA.");
		vga.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, We don't wprk with sound");
	}

}
