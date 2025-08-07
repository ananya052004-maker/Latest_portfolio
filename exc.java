import java.util.Scanner;
import java.io.*;
class Myexception extends Exception{
    public Myexception(String s){
        System.out.println("Error "+s);
    }
}
public class exc{
    public static void main(String[] args) throws Myexception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<18){
            throw new Myexception("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}