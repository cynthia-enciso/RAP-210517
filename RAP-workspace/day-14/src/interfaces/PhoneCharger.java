package interfaces;

public class PhoneCharger implements USBPluggable {

	@Override
	public void fits() {
		System.out.println("phone charger can be plugged in!");
	}

}
