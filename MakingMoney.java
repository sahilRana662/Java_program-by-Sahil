// This  is a MakingMoney program which  compute the worth of an investment today after a given period of time!
 
import java.util.Scanner;
public class MakingMoney{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the investment amount in CAD, for example 120000.95: ");
        double pV = sc.nextDouble();   // pV stands for Present Value in CAD
        System.out.println();   // to add one more line
        System.out.print("Enter annual interest rate %, for example 8.25: ");
        double annualInterstRate = sc.nextDouble(); 
        System.out.println();
        System.out.print("Enter number of years as an integer, for example 5: ");
        int years = sc.nextInt() ;
        System.out.println();
        double r = (annualInterstRate/100)/12; // here r is denoted for monthly interset
        int n = years * 12;  // n is denoted as Number of months
        double fV1 = (float)(pV * Math.pow(1+r,n))*100; 
        double fV2 = (int)fV1;
        double fV =  (fV2/100);  // fV is the future Value of investment in CAD
        double usD1 = (float)(fV * 0.747785)*100;
        double usD2 = (int) usD1;
        double usD = usD2 /100; // usD is the future Value of investment in USD
        System.out.println("Given an investment amount of $" + pV + " CAD, an annual interst rate of " + annualInterstRate + "%, and " + years + " year(s) of growth, the future value will be $" + fV + " CAD or $" + usD + " USD.");
    }
}
