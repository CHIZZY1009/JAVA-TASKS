public class Subtraction{
	
	public static int difference(int numberOne, int numberTwo){
	
	if(numberOne > numberTwo){
	return numberOne - numberTwo;
	}
	else{
	return numberTwo - numberOne;

	}

}


	public static void main(String[]args){
	int result = difference(2,15);
	System.out.println(result);

	}


  }