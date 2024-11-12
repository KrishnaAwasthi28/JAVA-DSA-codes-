import java.util.*;
public class bankingsystem {
    public static class Bank{
        public double bb=0;
        public void deposite(double amt){
            bb=bb+amt;
            System.out.println("Money Deposited Successfully !");
        }
        public void withdrawl(double amt){
            bb=bb-amt;
            System.out.println("Money Withdrwan Successfuly !");
        }
        public void balance(){
            System.out.println("Available Balance : "+bb);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to VS BANK ");
        int ch=0;
        Bank bank=new Bank();
        while(ch!=4){
            System.out.println("\n Enter 1 -> Deposite \n Enter 2 -> Withdrwal \n Enter 3 -> Balance Enquiry \n Enter 4 -> Exit");
            ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter the amount -> ");
                double amtt=sc.nextDouble();
                bank.deposite(amtt);
            }
            if(ch==2){
                System.out.println("Enter the amount -> ");
                double amtt=sc.nextDouble();
                bank.withdrawl(amtt);
            }
            if(ch==3){
                bank.balance();
            }
            if(ch<0 || ch>4){
                System.out.println("Invalid Choice !");
            }
        }
        System.out.println("Thank you for Visiting ");
        sc.close();
    }   
}

