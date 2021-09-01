import java.util.Scanner;
import java.text.NumberFormat;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int principal;
        int rate;
        float period;
        double Morgage;
        String MorgageFormated, principalFormated;
        while (true) {
            System.out.print("Enter Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 10000)
                break;
            System.out.println("Please Enter a valid amount");

        }
        while (true) {
            System.out.print("Enter Annual Interest Rate: ");
            rate = scanner.nextInt();
            if (rate >= 0 && rate <= 100)
                break;
            System.out.println("Please enter a valid rate");
        }
        while (true) {
            System.out.print("Enter Period: ");
            period = scanner.nextFloat();
            if (period >= 0 && period <= 30)
                break;
            System.out.println("Invalid period");
        }
        Morgage = principal
                * ((rate * Math.pow(1 + rate, period))
                / (Math.pow(1 + rate, period) - 1));


        MorgageFormated = NumberFormat.getCurrencyInstance().format(Morgage);

        principalFormated = NumberFormat.getCurrencyInstance().format(principal);

        System.out.println("----");
        System.out.println("Your principal is : " + principalFormated);
        System.out.println("Annual interest Rate is : " + rate);
        System.out.println("Period(Years)is : " + period);
        System.out.println("-----");
        System.out.println("MORGAGE");
        System.out.println("morgage: " +MorgageFormated);

        while (true) {
            System.out.println("edit: 1 for Yes. 2 for No ");
            num = scanner.nextInt();
            if (num == 2)
                break;
            while (true) {
                System.out.print("Enter Principal: ");
                principal = scanner.nextInt();
                if (principal >= 1000 && principal <= 10000)
                    break;
                System.out.println("Please Enter a valid amount");
            }
//            System.out.println("Your principal is : " + period + "%\r");
//            System.out.flush();
////            System.setOut(period);
        }
        System.out.println("---------");
        System.out.println("PAYMENT SCHEDURE");
        System.out.println("---------");

    }


}
