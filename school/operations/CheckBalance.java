package school.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CheckBalance {
    private int number;

    public CheckBalance (){
        try {

            File students = new File("Students.csv");
            //File tempFile = new File("Temp.csv");
            BufferedReader reader = new BufferedReader(new FileReader(students));
            //BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your admission number: ");
            number = scanner.nextInt();
            
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] studentDetails = currentLine.split(",");
                int adm = Integer.parseInt(studentDetails[3]);

                if(adm == number){
                    System.out.println("Your balance is: " + studentDetails[4]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }

    }
    
}
