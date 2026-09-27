public class Factorial{


	public static int factorialOf(int number){

	int factorial = 1;

		for(int i = 1; i <= number; i++){

		factorial = factorial * i;
	}

	return factorial;

	}

	public static void main(String[]args){

	int number = 5;

	int result = factorialOf(number);
	
	System.out.println(result);


}

}


