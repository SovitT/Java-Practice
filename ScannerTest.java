import java.util.Scanner;
public class ScannerTest 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll No: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your fees: ");
        double fees = sc.nextDouble();
        System.out.println("My name is : "+name+"\nMy Roll No : "+rollNo+"\nFees : "+fees);
        sc.close();
    }
}
