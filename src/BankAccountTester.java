/**
 * Muhammad Ibrahim
 * Bank Account Lab
 * 9 September 2020
 * EXTRA: Allow the user to select the amount deposited/withdrawn AND Use a decimal format for the money
**/

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccountTester {
    public static DecimalFormat df = new DecimalFormat("$#.00");
    public static Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        double withdrawal = 0, deposit = 0;
        BankAccount Bob = new BankAccount();
        BankAccount Joe = new BankAccount();

        //Ask the user how much to deposit and withdraw from Bob's account
        System.out.println("Bob:\nHow much would you like to deposit into Bob's account?");
        deposit = s.nextDouble();
        Bob.deposit(deposit); //deposit the money into the account
        System.out.println("How much would you like to withdraw from Bob's account?");
        withdrawal = s.nextDouble();
        Bob.withdraw(withdrawal); //withdraw the money from the account
        System.out.println("Current balance of Bob's account: " + df.format(Bob.balance)); //print the balance


        //Ask the user how much to deposit and withdraw from Joe's account
        System.out.println("\nJoe:\nHow much would you like to deposit into Joe's account?");
        deposit = s.nextDouble();
        Joe.deposit(deposit); //deposit the money into the account
        System.out.println("How much would you like to withdraw from Joe's account?");
        withdrawal = s.nextDouble();
        Joe.withdraw(withdrawal); //withdraw the money from the account
        System.out.println("Current balance of Joe's account: " + df.format(Joe.balance)); //print the balance
    }
}
