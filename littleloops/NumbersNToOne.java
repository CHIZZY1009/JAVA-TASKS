import java.util.Scanner;

public class NumbersNToOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}