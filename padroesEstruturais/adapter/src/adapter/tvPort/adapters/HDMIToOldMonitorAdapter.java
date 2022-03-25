package adapter.tvPort.adapters;

import adapter.tvPort.devices.OldMonitor;
import adapter.tvPort.interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI{

	public HDMIToOldMonitorAdapter() {
		super();
		System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter...");
	}
	
	@Override
	public void setImagem(String image) {
		System.out.println("Convering the image from HDMI to VGA");
		super.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		// TODO Auto-generated method stub
		System.out.println("Sorry, We don't work with sound");
	}
	

}
