//Use comparison operators to find out whether a given number is greater than the user entered number or not
import java.util.Scanner;
public class ch2_prset3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        
        //input part
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        
        //comparition part
        if(n>100){
            System.out.println(n+" is greater than 100.");
        }
        
        else if(n<100){
            System.out.println(n+" is samller than 100.");
        }

        else{
            System.out.println(n+" is equal to 100.");
        }
    }
    
}
