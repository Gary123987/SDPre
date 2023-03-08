import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

		System.out.println("Please enter the first number");
		num1 = keyboard.nextInt();

		System.out.println("Please enter the second number");
		num2 = keyboard.nextInt();

		System.out.println("Please enter the third number");
		num3 = keyboard.nextInt();

		System.out.println("Please enter the first decimal");
		dub1 = keyboard.nextDouble();

		System.out.println("Please enter the second decimal");
		dub2 = keyboard.nextDouble();

		System.out.println("Please enter the third decimal");
		dub3 = keyboard.nextDouble();

		System.out.println("The sum of "+num1+" + "+num2+" + "+num3+" = "+(num1+num2+num3));
		System.out.println("The sum of "+dub1+" + "+dub2+" + "+dub3+" = "+(dub1+dub2+dub3));




}
}