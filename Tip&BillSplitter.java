import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Main {
  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##########.00");
        df.setRoundingMode(RoundingMode.CEILING);
        
        System.out.println("This program is a tip and bill splitter.");
        System.out.println("It will use the values inputted to print a receipt for a bill.");
        
        System.out.println("Input the Bill amount:");
        double billAmount = Double.valueOf(scanner.nextLine());
        System.out.println("Input the Tip percentage:");
        int tipPercentage = Integer.valueOf(scanner.nextLine());
        System.out.println("Input the Number of people:");
        int numberOfPeople = Integer.valueOf(scanner.nextLine());
        
        double tip = (double) billAmount * tipPercentage /100;
        double total = (double) billAmount + tip;
        double average = total / numberOfPeople;
        double tipPerPerson = (double) tip / numberOfPeople;
        
        System.out.println("--- Receipt ---");
        System.out.println("Bill: " + df.format(billAmount));
        System.out.println("Tip: " + df.format(tip));
        System.out.println("Total: " + df.format(total));
        System.out.println("Each pays: " + df.format(average));
        System.out.println("Cost of tip per person: " + df.format(tipPerPerson));
        
        System.out.println("Please enter username:");
        String user = scanner.nextLine();
        System.out.println("Thank you " + user + " for supporting the business.");
    
  }
}