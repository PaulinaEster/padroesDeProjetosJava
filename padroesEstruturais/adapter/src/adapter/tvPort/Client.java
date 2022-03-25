package adapter.tvPort;

import adapter.tvPort.devices.Computer;
import adapter.tvPort.devices.OldMonitor;
import adapter.tvPort.devices.TV;
import adapter.tvPort.adapters.*;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		OldMonitor monitor = new OldMonitor();
		HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
		
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow","Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		pc.connectPort(new HDMIToVGAAdapter(monitor));
		pc.sendImageAndSound("Cat and rainbow","Nyan cat song");
		
		System.out.println("------ Monitor Class Adapter ----------");
		pc.connectPort(monitorAdapter);
		pc.sendImageAndSound("Cat and rainbow","Nyan cat song");
		
	}

}
