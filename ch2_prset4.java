//write the following expressioin in a java program ((v^2 - u^2)/2as)
import java.util.Scanner;
public class ch2_prset4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//variable declairing
        int v,u,a,s;

        //Input taking
        System.out.print("Enter the vale of v : ");
        v=sc.nextInt();
        System.out.print("Enter the vale of u : ");
        u=sc.nextInt();
        System.out.print("Enter the vale of a : ");
        a=sc.nextInt();
        System.out.print("Enter the vale of s : ");
        s=sc.nextInt();

        //print the result
        System.out.println("Result = "+((v*v - u*u)/2*a*s));

    }
}
