import java.util.Scanner;

public class LogicalOperationApp3a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an interger that is not between 1 and 10:");
		int i = input.nextInt();
		boolean isNotBetween1And10 = i<1 || i >10; 
		System.out.println("The number you entered "+ i + " is not betwen 1 and 10: " + isNotBetween1And10);
		input.close();

	}

}
