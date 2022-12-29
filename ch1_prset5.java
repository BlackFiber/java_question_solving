//write a program to detect whether a number entered by the user is integer or not
import java.util.Scanner;
public class ch1_prset5 {
    public static void main(String[] args){
        //variable declairing
        float n;
        int check;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to check : ");
        n=sc.nextFloat();
        check=(int)n;
        if(n==check){
            System.out.println(check+" is an integer value.");
        }

        else{
            System.out.println(n+" is a floating number.");
        }

    }
}
