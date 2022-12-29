//Write a java program to convert kilometers to miles
import java.util.Scanner;
public class ch1_prset4 {
    public static void main(String[] args){
        //declairing variables
        float km,miles;
        Scanner sc=new Scanner(System.in);

        //Input taking
        System.out.print("Enter the length in kilometers : ");
        km=sc.nextFloat();

        //convert km in to miles
        miles=(float)(km*0.621371);

        //print the result
        System.out.println(km+" km = "+miles+" miles");
    }

}
