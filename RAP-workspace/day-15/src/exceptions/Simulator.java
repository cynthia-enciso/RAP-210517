package exceptions;

public class Simulator {
	public static void main(String[] args) {
		
		System.out.println("Before potential exception");
		Pen pen = null;
		
		try {
			sumOddNumbers(3, 4);
		} catch(EvenNumberException ex) {
			ex.printStackTrace();
			// provide additional possible choices because of this particular exception
			System.out.println("do something else related to this issue!");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("In Finally");
		}
		
		try {
			pen.getInkColor();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("After potential exception");
	}
	
	public static int sumOddNumbers(int num1, int num2) throws EvenNumberException {
		if (num1 % 2 == 0) {
			throw new EvenNumberException("first input is even");
		} else if (num2 % 2 == 0) {
			throw new EvenNumberException("second input is even");
		}
		
		return num1 + num2;
	}
	

}
