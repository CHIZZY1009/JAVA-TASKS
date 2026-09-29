public class CompoundInterest{

    public static void main(String[] args) {

        double principal = 1000.0;

        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {

            for (int year = 1; year <= 5; year++) {

                double compound = principal * Math.pow(1.0 + rate, year);

                System.out.println("Rate: " + rate +
                                   " Year: " + year +
                                   " Compound amount: " + compound);
            }
        }
    }
}