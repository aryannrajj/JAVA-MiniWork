import java.util.*;

 abstract class Account {
    String custname;
    static int acc;
    int accno;
    float balance;

    // final public String bankName = "SBI BANK";
     abstract float CalculateInterest();
    Account() {
        acc++;
        custname = "Default";
        accno = acc;

    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the customer name: ");
        custname = sc.nextLine();
        System.out.println("\n Enter the account number: ");
        accno = sc.nextInt();
        System.out.println("\n Enter the account balance: ");
        balance = sc.nextFloat();
        // sc.close();
    }

    public void display() {
        System.out.println("\n customer name: " + custname);
        System.out.println(" the account number: " + accno);
        System.out.println(" the account balance: " + balance);
    }
}

class LoanAccount extends Account {
    float intRate;
    int amountSanc;

    public void read() {
        super.read();
        Scanner rr = new Scanner(System.in);
        System.out.println("Enter the Amount sanctioned: ");
        amountSanc = rr.nextInt();
        System.out.println("Enter the Interest rate: ");
        intRate = rr.nextFloat();
        // rr.close();
    }

    float CalculateInterest() {
        float z = amountSanc * (intRate/100);
        return z;
     }

    public void display() {
        super.display();
        System.out.println(" Interest rate : " + intRate);
        System.out.println(" Amount sanctioned: " + amountSanc);
        System.out.println(" Total Interest Amount: " + CalculateInterest());
    }
}

public class Loan_Interest {
    public static void main(String[] args){
        LoanAccount ob = new LoanAccount();
        final String i;
        i = "\n This Is Final";
        System.out.println(i);
        ob.read();
        ob.display();
    }
}
