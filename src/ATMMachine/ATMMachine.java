package ATMMachine;
import java.util.*;
class Atm {
    float balance;
    int accountNo = 123456789;
    int pin = 3456;

    public void Check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account Number");
        int enteredaccount=sc.nextInt();
        System.out.println("Enter your Pin");
        int enteredpin=sc.nextInt();
        if(pin==enteredpin && accountNo==enteredaccount){
            menu();
        }
        else{
            System.out.println("AccountNo or Pin is Incorrect");
            Check();
        }

    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            CheckBalance();
        }
        else if(opt==2){
            Withdraw();
        }
        else if(opt==3){
            Deposit();
        }
        else if(opt==4){
            System.out.println("Thank you for visting our bank");
            Check();
        }
        else{
            System.out.println("Invalid option");
        }

    }
    public void CheckBalance(){
        System.out.println(balance);
    }
    public void Withdraw(){
        System.out.println("Enter amount to be withdrawn");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Money Withdrawn Successfully");
        }
        menu();
    }
    public void Deposit(){
        System.out.println("Enter the amount ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
        balance=balance+amount;
        menu();
    }

}

public class ATMMachine {
    public static void main(String[] args) {
        Atm obj=new Atm();
        obj.Check();
    }
}
