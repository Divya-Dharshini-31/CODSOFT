package TASK3;

public class User implements ATM{
    int accNo;
    String name;
    double balance;

    public User(){
        accNo=0;
        name=null;
        balance=0.0;
    }

    public User(int accNo,String name){
        this.accNo=accNo;
        this.name=name;
    }

    public User(int accNo,String name,double balance){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Error! Amount to withdraw is greater than Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawl Successful! Updated Balance: "+balance);
        }
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Error! Amount should not be negative or zero");
        }
        else{
            balance=balance+amount;
            System.out.println("Deposit successful! Updated Balance: "+balance);
        }
    }

    public void checkBalance(){
        System.out.println("Account number: "+accNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
