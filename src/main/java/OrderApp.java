import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MasterOrder cookies = new MasterOrder();
		cookies.addOrder(new CookieOrder("Tagalongs",1));
		cookies.addOrder(new CookieOrder("Thin Mints",5));
		cookies.addOrder(new CookieOrder("Samoas",2));
		cookies.addOrder(new CookieOrder("Tagalongs",3));
		
		System.out.println("Current Order: ");
		cookies.showOrder();
		System.out.println("\nYou have ordered " + cookies.getTotalBoxes() + " boxes.");
		
		System.out.println("What variety or none would you like to remove?");
		String variety = input.nextLine();
		System.out.println("You are removing " + variety);
		cookies.removeVariety(variety);
		System.out.println("Updated Order: ");
		cookies.showOrder();
		
	}

}
