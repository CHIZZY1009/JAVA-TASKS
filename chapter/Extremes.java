import java.util.Scanner;


public class Extremes{

	public static void main(String[]args){

Scanner input = new Scanner(System.in);

int largest = 0;
int smallest = 0;
int sum = 0;

System.out.println("ENTER 5 INTEGERS!!");
for(int i =1; i <= 5; i++){
System.out.print("Enter Integer:  ");
int number = input.nextInt();

if(i == 1){
largest = number;
smallest = number;
}


if ( number > largest){
largest  =  number;
}


if(number < smallest){
smallest = number;
}

sum = largest + smallest;

}
System.out.println("The maximum number is: "  +largest );
System.out.println("The minimum number is: "  +smallest );
System.out.println("The sum of the maximum and minimum number is: "  +sum);













}




}