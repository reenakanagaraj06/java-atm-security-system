import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean cardValid = scan.nextBoolean();
        boolean pinCorrect = scan.nextBoolean();
        boolean accountActive = scan.nextBoolean();
        boolean userBlocked = scan.nextBoolean();
        double balance = scan.nextDouble();
        double withdrawAmount = scan.nextDouble();

        boolean atm_access = (cardValid && pinCorrect && accountActive && !userBlocked);

        boolean canWithdraw = (withdrawAmount > 0 && withdrawAmount <= balance && atm_access);
        if(canWithdraw)
        {
            double remaining_balance = balance - withdrawAmount;
            System.out.println("remaining balance : "+ remaining_balance);
        }

        System.out.println("ATM access: "+atm_access);
        System.out.println("Withdrawal allowed: "+canWithdraw);



    }
}
