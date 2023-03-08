import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String fname = "";
		String lname = "";
		String faveAnimal = "";
		String faveFood = "";
		String faveSong = "";

		System.out.println("Please enter your first name");
		fname = keyboard.nextLine();

		System.out.println("Please enter your last name");
		lname = keyboard.nextLine();

		System.out.println("Please enter your favorite animal");
		faveAnimal = keyboard.nextLine();

		System.out.println("Please enter your favorite food");
		faveFood = keyboard.nextLine();

		System.out.println("Please enter your favorite song");
		faveSong = keyboard.nextLine();

		System.out.println("Your name is "+fname+" "+lname);
		System.out.println("Your favorite animal is the "+faveAnimal);
		System.out.println("Your favorite food is "+faveFood);
		System.out.println("Your favorite song is "+faveSong);

	}
}