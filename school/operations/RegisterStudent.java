package school.operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegisterStudent {
    public String name; 
    public String form;
    public int age, adm;
    public float balance, amountPaid;

    public static final FEES = 45000;

    public RegisterStudent(){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.print("Enter your form: ");
    form = scanner.nextLine();

    //scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    System.out.print("Enter your Admission number: ");
    adm = scanner.nextInt();

    System.out.print("Enter amount: ");
    amountPaid = scanner.nextFloat();

    scanner.close();
    }

    balance = FEES - amountPaid;

    System.out.println(+name "registered successfully. The school fees balance is" +balance);

    public String getName(){
        return name;
    }

    public String getForm(){
        return form;
    }

    public int getAge(){
        return age;
    }

    public int getAdm(){
        return adm;
    }

    public float getBalance(){
        return balance;
    }

    public void saveStudentDetails(){
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("Students.csv", true))){
        
        writer.write(name + "," + form + "," + age + "," + adm + "," + balance);
        
    }catch(IOException e){
        System.err.println("Error writing to file " + e.getMessage());
    }  
} 
}

