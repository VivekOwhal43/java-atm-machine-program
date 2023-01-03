import java.util.Scanner;

class TransactionMachine
{
    Scanner sc = new Scanner(System.in);
    void enterPassword()
    {
        int password=1234;
        System.out.println("============= Welcome to Transaction Macine =============");
        System.out.println(" Please Enter Your Password ");
        password = sc.nextInt();
        if(password == 1234)
        {
            System.out.println("Success !!!");
        }
        else
        {
            System.out.println("Incorrect Password !!! \nTransaction Canceled....");
        }
    }
    
    public static void main(String[] args)
    {
        
    }
}