public class Division{

	public static float divide(int numberOne, int numberTwo){

	if(numberTwo == 0){
	return 0;
	}
	return (float) numberOne / numberTwo;
	

	}


	public static void main(String[] args){
	float result = divide(20,5);	
	System.out.println(result);

}






}