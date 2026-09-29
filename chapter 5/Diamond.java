import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an odd number from 1 to 19: ");
        int rows = input.nextInt();

   
        for (int i = 1; i <= rows; i += 2) {

            for (int j = i; j < rows; j += 2) {
                System.out.print(" ");
            }

      
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    
        for (int i = rows - 2; i >= 1; i -= 2) {

          
            for (int j = i; j < rows; j += 2) {
                System.out.print(" ");
            }

       
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    
    }
}