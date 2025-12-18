import java.util.Scanner;
class ATM{
    int acc_num=1234567;
    int password=8899;
    int AN,PWD;
    void acceptInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the account number:");
        AN=s.nextInt();
        System.out.println("Enter the password:");
        PWD=s.nextInt();
    }
    void verify(){
        if(acc_num==AN&& password==PWD){
            System.out.println("Collect your money!");
            

        }
        else{
            System.out.println("Invalid card details.Try again!");
           

        }

    }
}
class Bank{
    void initiate(){
        ATM atm=new ATM();
        atm.acceptInput();
        atm.verify();
    }
}
public class CustomException{
    public static void main(String[] args){
    Bank b=new Bank();
    b.initiate();
    }
}