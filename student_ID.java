import java.util.Scanner;

public class student_ID {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        char choice;
        System.out.println("Student Details");
        System.out.println("===============");
        System.err.println("Enter Sid: ");
        int sid = s.nextInt();
        s.nextLine();
        System.out.println("Enter Sname: ");
        String sname = s.nextLine();
        System.out.println("Enter Sdep: ");
        String sdep = s.nextLine();

        System.out.println("Student ID: "+sid);
        System.out.println("Student Name: "+sname);
        System.out.println("Student Department: "+sdep);

        System.out.println("do you want add(y/n):");
        choice=s.next().charAt(0);
        if(choice!='y'&& choice!='Y'){
            // break;
        }
        s.close();

    }
}
