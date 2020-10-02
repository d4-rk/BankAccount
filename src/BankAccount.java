import java.text.DecimalFormat;

public class BankAccount {
    public static DecimalFormat df = new DecimalFormat("$#.00");
    double balance;
    //make an account with a balance of 0
    public BankAccount(){
        balance = 0;
    }
    //Methods
    //method to deposit inputted amount to the balance
    public void deposit(double amount){
        //add the amount to the balance
        balance += amount;
        System.out.println(df.format(amount) + " was deposited."); //print confirmation
    }
    //method to withdraw inputted amount from the balance
    public void withdraw(double amount){
        //If the amount withdrawn is less then the balance then subtract from balance otherwise return an error
        if(balance > amount){
            balance = balance - amount;
            System.out.println(df.format(amount) + " was withdrawn."); //print confirmation
        } else{
            System.out.println("Not enough money in the account!");
        }
    }
    //return the balance
    public double getBalance(){
        return balance;
    }
}
