import java.util.Scanner;

public class amount{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount ");
        int prinamt = sc.nextInt();

        System.out.println("Enter no. of years ");
        int years = sc.nextInt();

        System.out.println("Enter rate of Interest ");
        int interest = sc.nextInt();

        int totalInterest = prinamt*years*interest/100;
        int totalAmt = totalInterest+prinamt;

        System.out.println("Total Interest: "+totalInterest+"rs");
        System.out.println("Total amount: "+totalAmt+"rs");

        sc.close();
    }
}