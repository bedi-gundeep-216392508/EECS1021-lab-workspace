
public class LogiacalOperations1 {
	public static void main(String[] args) {
		/*
		 * There are three logical operators for you to
		 * combine relational operations (each of which evaluating to true or false).
		 * Logical negation (not)           !
		 * Logical conjunction (and)        &&
		 * Logical disjunction (or)         ||
		 */
		boolean p =true;
		boolean negation = !p;
		System.out.println("Logical negation of p being "+ p + " is:" + negation );
		p= false;
		negation =!p;
		System.out.println("Logical negatoin of p being " + p + " is:" + negation);

	}
}
