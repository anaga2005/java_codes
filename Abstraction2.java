import java.util.Scanner;
abstract class Calculator{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}
class MyCalculator extends Calculator{
    void add(){
        int num1=20;
        int num2=30;
        int sum=num1+num2;
        System.out.println("The sum is:"+sum);
    }
    void sub(){
        int num1=20;
        int num2=30;
        int sub=num1-num2;
        System.out.println("The sub is:"+sub);
    }
    void mul(){
        int num1=20;
        int num2=30;
        int mul=num1*num2;
        System.out.println("The mul is:"+mul);
    }
    void div(){
        int num1=20;
        int num2=30;
        int div=num1%num2;
        System.out.println("The div is:"+div);
    }
}
class MyCalculator2 extends Calculator{
    void add(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1=s.nextInt();
        System.out.println("Enter the second number:");
        int number2=s.nextInt();
        int sum=number1+number2;
        System.out.println("The sum is:"+sum);

    }
     void sub(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1=s.nextInt();
        System.out.println("Enter the second number:");
        int number2=s.nextInt();
        int sub=number1-number2;
        System.out.println("The sub is:"+sub);

    }
     void mul(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1=s.nextInt();
        System.out.println("Enter the second number:");
        int number2=s.nextInt();
        int mul=number1*number2;
        System.out.println("The mul is:"+mul);

    }
     void div(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1=s.nextInt();
        System.out.println("Enter the second number:");
        int number2=s.nextInt();
        int div=number1%number2;
        System.out.println("The div is:"+div);

    }
}
class Math{
    void arithmetic(Calculator c){
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
public class Abstraction2{
    public static void main(String[] args){
        MyCalculator m1=new MyCalculator();
         MyCalculator m2=new MyCalculator();
         Math m=new Math();
         m.arithmetic(m1);
         System.out.println("------------------------------------------");
         m.arithmetic(m2);
    }
}