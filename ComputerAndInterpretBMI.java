import java.util.Scanner;

public class ComputerAndInterpretBMI {

	public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
		
		double height, heightInMeters, weight, weightInKg, BMI = 0;		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your height in inches:");
		double height1 = input.nextDouble();
		double heightInMeters1 = (height1 * 0.0254);
		
		System.out.println(name + ", enter your weight in pounds:");
		double weight1 = input.nextDouble();
		double weightInKg1 = (weight1 * 0.45359237);		
		
		double BMI1 = ((weightInKg1)/(heightInMeters1 * heightInMeters1));
				
		System.out.println(name + ", your BMI is " + BMI1);
		if(BMI1 < 18.5) {
			System.out.println("You are underweight!");
		}
		else if(BMI1 >= 18.5 && BMI1 <25) {
			System.out.println("You are of normal weight!");
		}
		else if(BMI1 >= 25 && BMI1 < 30.0) {
			System.out.println("You are overweight!");
		}		
		else if(BMI1 >= 30.0) {
			System.out.println("You are obese!");
		}
		input.close();
	}

}
