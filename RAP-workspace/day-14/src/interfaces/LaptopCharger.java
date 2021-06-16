package interfaces;

public class LaptopCharger implements USBPluggable {

	@Override
	public void fits() {
		System.out.println("laptop charger can be plugged in!");
	}

}
