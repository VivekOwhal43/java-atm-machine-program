import java.util.Scanner;

class TransactionMachine
{
    Scanner sc = new Scanner(System.in);
    int accountBalence= 10000;
    void withdraw()
    {
        int withdrawAmount;
        System.out.print("\nPlease Enter an Amount To Be Withrawed: ");
        withdrawAmount = sc.nextInt();
        accountBalence = accountBalence-withdrawAmount;
        System.out.println("Transaction Successful !!! \nWithdraded " +withdrawAmount+ " From Your Account");
        System.out.println("Current Balence is: "+accountBalence);
    }
    void transactionMenu()
    {
        int choice;
        System.out.println("Welcom TO JAVA ATM");
        do
        {
            System.out.println("\n \nPlease Enter Your Choice.\n1.Banking \n2.Ministatement \n3.Quick Cash \n4.Change ATM Pin \n5. Exit \n");
            System.out.print("Choice = ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                withdraw();
                break;

                case 5:

                break;
                
                default:
                System.out.println("\n \nPlease Enter Correct Choice. \n \n");
            }

        }while(choice != 5);
    }
    void enterPassword()
    {
        int password=1234;
        System.out.println("============= Welcome to Transaction Macine =============");
        System.out.println(" Please Enter Your Password ");
        password = sc.nextInt();
        if(password == 1234)
        {
            //System.out.println("Success !!!");
            transactionMenu();
        }
        else
        {
            System.out.println("Incorrect Password !!! \nTransaction Canceled....");
        }
    }
    
    public static void main(String[] args)
    {
        TransactionMachine atm = new TransactionMachine();
        atm.enterPassword();
    }
}