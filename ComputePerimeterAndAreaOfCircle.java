import java.util.*;
public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer for radius:");
		int r = Integer.parseInt(sc.nextLine());
		System.out.println("What is your name");
		String name = sc.nextLine();
		double perimeter = 2*3.14*r;
		double area = 3.14*r*r;
		System.out.printf("%s, your input circle with radius %d has a permieter %.2f and area %.2f", name,r,perimeter,area);
		sc.close();

	}

}
