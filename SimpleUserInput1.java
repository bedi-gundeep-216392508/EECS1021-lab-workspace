import java.util.*;
public class SimpleUserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter and integer:");
		
		int i = sc.nextInt();
		
		int square = i*i;
		
		System.out.printf("The square of %d is %d.",i,square);
		
		sc.close();
	}

}
