package abstraction;

import interfaces.Purchasable;

public class Simulator {
	public static void main(String[] args) {
		// creating objects
//		WritingTool tool = new WritingTool();
		
//		Pen pen = new Pen();
		
		BallpointPen ballpoint = new BallpointPen();
		
		System.out.println(ballpoint.getUseability());
		
		ballpoint.isRefillable();
		
		ballpoint.defaultMethodPurchasable();
		
		System.out.println(Purchasable.LOWEST_COST);
		
		Purchasable.staticMethod();
	}
}
