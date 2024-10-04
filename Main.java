import java.util.Scanner;
import school.operations.CheckBalance;
import school.operations.Options;
import school.operations.RegisterStudent;
import school.operations.ViewDetails;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose;

        Options options = new Options();

        do {
            System.out.println("\nWELCOME TO THIS SCHOOL");
            System.out.println("Please choose an option: ");
            options.choices();
            choose = scanner.nextInt();

            switch(choose){
                case 1:
                RegisterStudent student = new RegisterStudent();
                student.saveStudentDetails();
                break;

                case 2:
                CheckBalance balance = new CheckBalance();
                break;

                case 3:
                ViewDetails details = new ViewDetails();
                break;

                case 4:
                System.out.println("Exit");
                break;

                default:
                System.out.println("Invalid choice, please try again");

            }    
        } while (choose != 2 );
        scanner.close();

        
    }
}