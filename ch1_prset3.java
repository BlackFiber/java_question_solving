//Write a program which ask the user to enter his/her name and greet them with "hello <name>, have a good day" txt
import java.util.Scanner;
public class ch1_prset3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //input the user name
        System.out.print("What is your name? : ");
        String name =sc.nextLine();

        //print the message
        System.out.println("Hello "+name+", have a good day");
    }
}
