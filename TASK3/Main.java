package TASK3;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------ATM INTERFACE----------");

            //getting details from the user
            System.out.print("Enter Account number: ");
            int accNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter balance amount(if any): ");
            double balance=sc.nextDouble();
            User user=new User(accNo,name,balance);
            
            //selecting which function to perform
            int opt;
            System.out.println("Press 1 to withdraw. \nPress 2 to Deposit \nPress 3 to Check Balance");
            opt=sc.nextInt();
            sc.nextLine();
            if(opt==1){
                System.out.print("Enter amount to withdraw: ");
                double amount=sc.nextDouble();
                user.withdraw(amount);
            }
            else if(opt==2){
                System.out.print("Enter amount to deposit");
                double amount=sc.nextDouble();
                user.deposit(amount);
            }
            else if(opt==3){
                System.out.println("User Detail: ");
                user.checkBalance();
            }
            else{
                System.out.println("Invalid choice! Exiting...");
            }

        sc.close();
    }
}
