import java.util.*;

interface FirstCalculator{
    void add();
    void sub();
}
class MyCalculator1 implements FirstCalculator{
    void add{
        int number1=20;
        int number2=30;
        int sum=number1+number2;
        System.out.println("The Sum is ; " + sum);
    }
    void sub{
        int number1=20;
        int number2=30;
        int diff=number1-number2;
        System.out.println("The Difference is ; " + diff);
    }
}

class MyCalculator2 implements FirstCalculator{
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2=sc.nextInt();
        int sum=number1+number2;
        System.out.println("The Sum is : " + sum);
    }
    public void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2=sc.nextInt();
        int sub=number1-number2;
        System.out.println("The Differnce is : " + sub);

    }
}

public class Interface{
    public static void main(String[]args){
        MyCalculator1 m1=new MyCalculator1();
        MyCalculator2 m2=new MyCalculator2();
        m1.add();
        m1.sub();
        m2.add();
        m2.sub();
    }
}