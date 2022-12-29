//Write a java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade.
import java.util.Scanner;
public class ch2_prset2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//input part
        int n,encry,decry;
        System.out.print("Enter the number : ");
        n=sc.nextInt();

//encryption part
        encry=n+8;
        System.out.println("After encryption the number will be : "+encry);

//Decryption part
        decry=encry-8;
        System.out.println("After decrypt the encryption part the number will be : "+decry);


    }

}
