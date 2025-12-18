import java.util.Scanner;

class Addition extends Thread
{
    public void run()
    {
        System.out.println("Addition Task started");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = s.nextInt();

        System.out.println("Enter the second number :");
        int b = s.nextInt();

        int sum = a + b;
        System.out.println("Sum is : " + sum);

        System.out.println("Addition task completed");
    }
}

class CharacterPrinting extends Thread
{
    public void run()
    {
        System.out.println("Character printing started");
        for(int i = 65; i <= 75; i++)
        {
            System.out.println((char)i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Character printing task is complete");
    }
}

class NumberPrinting implements Runnable
{
    public void run()
    {
        System.out.println("Number printing is started");
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing is completed");
    }
}

public class Runmethod
{
    public static void main(String[] args)
    {
        Addition a = new Addition();
        CharacterPrinting c = new CharacterPrinting();

        NumberPrinting np = new NumberPrinting();
        Thread t = new Thread(np);

        a.start();
        c.start();
        t.start();
    }
}
