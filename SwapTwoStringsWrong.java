
public class SwapTwoStringsWrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1 = "Alan";
		String p2 = "Tom";
		
		System.out.println("Before the swap:");
		System.out.printf("Person1 is %s and Person2 is %s.",p1,p2);
		
		p1 = p2;
		p2 = p1;
		
		System.out.println();
		System.out.println("After the swap:");
		System.out.printf("Person1 is %s and Person2 is %s.",p1,p2);
		

	}

}
