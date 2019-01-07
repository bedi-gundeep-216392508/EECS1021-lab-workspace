import java.util.*;
public class SimpleUserInput2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number which can have a decimal:");
		
		double n1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter the second number which can have a decimal:");
		
		double n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter your name:");
		
		String name = sc.nextLine();
		
		double avg = (n1+n2)/2;
		
		System.out.printf("%s, the numbers you enterered were %.1f and %.1f the average is %.1f",name,n1,n2,avg);
		
		sc.close();
		
	}

}
