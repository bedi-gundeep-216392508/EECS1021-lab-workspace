import java.util.*;
public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String n = sc.nextLine();
		System.out.println("Enter an integer for seconds:");
		int a = Integer.parseInt(sc.nextLine());
		int min = a/60;
		int sec = Math.abs((min* 60)-a);
		System.out.printf("%s, your input %d seconds can be divided into %d minutes and %d seconds.", n,a,min,sec);
		sc.close();
	}

}
