package covariance;

import java.util.Scanner;

public class Zoo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean visiting = true;
		Animal anim = null;
		
		while (visiting) {
			System.out.println("What Animal would you like to visit? B, C, P, or S? ");
			String choice = scanner.nextLine().toLowerCase();
			switch (choice) {
			case "b":
				anim = new Bear("Bruce");
				break;
			case "c":
				anim = new Capybara("Cappy");
				break;
			case "p":
				anim = new Platypus("Platty");
				break;
			case "s":
				anim = new Shark("Sharky");
				break;
			case "quit":
				anim = null; // we do not print information about animal
				visiting = false; // stop the loop
				break;
			default:
				System.out.println("Sorry, I did not recognize that");
				anim = null;
			}
			
			if (anim != null) {
				System.out.println(anim);
			}
		}
		
		System.out.println("Thanks for visiting!");
	}
}
