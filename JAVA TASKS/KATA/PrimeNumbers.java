public class PrimeNumbers{
	public static boolean isPrime(int number){

	if(number <= 1){
	return false;
}
	for(int i = 2; i < number; i++){
	if (number % i == 0){
	return false;
}
}

 return true;
}



	public static void main(String[]args){
	int number = 17;
	boolean result = isPrime( number);
	System.out.println(result);
}

	


}