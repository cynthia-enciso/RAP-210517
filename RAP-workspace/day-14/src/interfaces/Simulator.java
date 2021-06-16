package interfaces;

public class Simulator {
	public static void main(String[] args) {
		USBPluggable myCable = new LaptopCharger();
		
		myCable.fits();
		
		myCable = new PhoneCharger();
		
		myCable.fits();
	}
}
