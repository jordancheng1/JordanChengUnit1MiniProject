import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        // asks for total amount
        System.out.print("Total Bill? : ");
        double totalBill = scan.nextDouble();

        // asks for desired tip percentage
        System.out.print("Tip % (w/o % sign) : ");
        double tipPercent = scan.nextDouble();

        // asks for the amount of people in the party
        System.out.print("Number of people : ");
        int numPpl = scan.nextInt();

        // calculates the amount of tip
        double tipTotal = totalBill * (tipPercent / 100);

        // calculates the entire bill including tip
        double total = totalBill + tipTotal;

        // calculates how much tip each person should pay
        double tipPer = tipTotal / numPpl;

        // calculates how much each person should pay including tip
        double totalPer = total / numPpl;

        // prints amount of tip
        System.out.println("Total Tip : " + Math.round(tipTotal * 100) / 100.0);

        // prints entire bill including tip
        System.out.println("Total Bill : " + Math.round(total * 100) / 100.0);

        // prints tip per person
        System.out.println("Tip Paid per Person : " + Math.round(tipPer * 100) / 100.0);

        // prints total per person
        System.out.println("Total Paid per Person : " + Math.round(totalPer * 100) / 100.0);
    }
}