public class Square{

	public static boolean isPerfectSquare(int number){
	
		if(Math.pow(number, 0.5) == (int)Math.pow(number, 0.5)){
		return true;
		}
		else{
		return false;
		}
	}



	public static void main(String[]args){
	int number = 25;
	boolean result = isPerfectSquare(number);
	System.out.println(result);

}
}