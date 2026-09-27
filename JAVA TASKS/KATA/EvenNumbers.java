

public class EvenNumbers{

	public static boolean isEven(int number){
	

	if(number % 2 == 0){
	return true;
	}
	else{
	return false;


}
}


	public static void main(String[] args){
	int number = 10;
	boolean result = isEven(number);
	System.out.println(result);
}
}