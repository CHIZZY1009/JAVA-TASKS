public class PythagoreanTriples {

    public static void main(String[] args) {

        System.out.println("Side1\tSide2\tHypotenuse");

        
for (int side1 = 1; side1 <= 500; side1++) {

 for (int side2 = side1; side2 <= 500; side2++) {

 for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {

 if (side1 * side1 + side2 * side2
 == hypotenuse * hypotenuse) {

 System.out.println(side1 + "\t"
 + side2 + "\t"
+ hypotenuse);
                    }
                }
            }
        }
    }
}