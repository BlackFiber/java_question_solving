//Write a program to sum three numbers in java
import java.util.Scanner;
public class ch1_prset1 {
    public static void main(String[] args){
        //declairing variables
        int n1,n2,n3;

        Scanner n=new Scanner(System.in);

        //Input part
        System.out.print("Enter the 1st number : ");
        n1=n.nextInt();

        System.out.print("Enter the 2nd number : ");
        n2=n.nextInt();

        System.out.print("Enter the 3rd number : ");
        n3=n.nextInt();
        //Print the result 
        System.out.println("Sum of this two numbers is : "+(n1+n2+n3));

    }


}
