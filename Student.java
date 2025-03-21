import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
 
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Mark1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter Mark2: ");
        double mark2 = scanner.nextDouble();

        System.out.println("Student name is " + firstName + " " + lastName);
        System.out.println("Studengt ID is : " + id);
        System.out.println("Student Average is : " + mark1+mark2/2);
        

        scanner.close();
    }
}