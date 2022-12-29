//Write a program to calculate GPA using marks of three subjects out of 100
import java.util.Scanner;
public class ch1_prset2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //variable declairing
        int s1,s2,s3;

        //take inputs
        System.out.print("Enter the marks of the 1st subject : ");
        s1=sc.nextInt();

        System.out.print("Enter the marks of the 2nd subject : ");
        s2=sc.nextInt();

        System.out.print("Enter the marks of the 3rd subject : ");
        s3=sc.nextInt();

         //Check the condition and give the output
        if(s1<=100 && s2<=100 && s3<=100){
            System.out.println("Total GPA = "+(s1+s2+s3)/3);
        }

        else{
            System.out.println("Try with right inputs");
        }

    }
}
