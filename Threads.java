class SquareThread extends Thread {
    int[] arr = {1, 20, 50, 15, 30};
    public void run() {
        System.out.println("Squares of numbers in the array:");
        for (int n : arr) {
            System.out.println("Square of " + n + " : " + (n * n));
        }
    }
}

class AverageThread extends Thread {

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("The average of the first 10 numbers is: " + avg);
    }
}

public class Threads {
    public static void main(String[] args) throws Exception {

        SquareThread t1 = new SquareThread();
        AverageThread t2 = new AverageThread();

        t1.start();
        t1.join();   
        t2.start();
    }
}