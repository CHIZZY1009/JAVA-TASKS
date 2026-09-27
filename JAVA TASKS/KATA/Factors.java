public class Factors{
	
	public static int factorsOf(int number){
	
	
	int count = 0;

	for(int i = 0; i<= number; i++ ){
	
	if(number % count == 0){
	count++;
	
	}
	}
	return count;

	}

 

	public static void main(String[]args){
	
	int result = factorsOf(10);
	
	System.out.println(result);

}

}