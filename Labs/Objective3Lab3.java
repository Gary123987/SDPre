public class Objective3Lab3 {
	public static void main(String[] args) {
		var first = 1 + (int)(Math.random() * 6);
		var second = 1 + (int)(Math.random() * 6);
		var third = 1 + (int)(Math.random() * 6);
		var total = first+second+third;
		System.out.println(first+" + "+second+" + "+third+" = "+total);
	}
}