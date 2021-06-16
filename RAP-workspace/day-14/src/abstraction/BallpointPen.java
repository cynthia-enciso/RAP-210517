package abstraction;

import interfaces.Purchasable;
import interfaces.Refillable;

public class BallpointPen extends Pen implements Purchasable, Refillable {

	@Override
	public void write() {
		System.out.println("*writes smoothly in ink*");
	}

	@Override
	public void isRefillable() {
		System.out.println("can be refilled!");
		
	}

	@Override
	public void isPurchasable() {
		System.out.println("can be purchased!");
		
	}

//	@Override
//	public void isDoable() {
//		System.out.println("can be purchased!");
//	}
//
//	@Override
//	public void defaultMethod() {
//		Refillable.super.defaultMethod();
////		Purchasable.super.defaultMethod(); <-- can do
//	}

	
}
