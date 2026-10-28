			
public class switchArrays {

    public static int[][] arrays(int[][] numbers) {

        int[][] newArray = new int[numbers.length][];

        for (int index = 0; index < numbers.length; index++) {
            newArray[index] = numbers[numbers.length - 1 - index];
        }

        for (int index = 0; index < newArray.length; index++) {
            for (int indexTwo = 0; indexTwo < newArray[index].length; indexTwo++){
                System.out.print(newArray[index][indexTwo] + " ");
            }
            System.out.println();
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[][] numbers = arrays(new int[][] {
            {1, 2, 3},
            {4, 5, 6}
        });

    }
}