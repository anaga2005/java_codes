
import java.util.Scanner;
public class Multi{
    public static void main(String[] args){
        Scanner sc=new sc(System.in);
        int age[][][]=new int[2][3][4];
        for(int i=1;i<=age.length;i++){
            for(int j=1;j<=age[i].length;j++){
                for(int k=0;k<age[i][j].length;k++){
                    System.out.println("Enter the age of the student"+k+"classroom"+j+"branch"+i);
                    age[i][j][k]=sc.nextInt();
                }

            }
        }


    }
}