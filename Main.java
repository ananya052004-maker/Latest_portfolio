import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        File input = new File("Input.txt");
        input.createNewFile();
        FileWriter f = new FileWriter(input);
        PrintWriter p = new PrintWriter(f);
        FileReader r = new FileReader(input);
        BufferedReader b = new BufferedReader(r);
        
        File output = new File("Ouput.txt");
        output.createNewFile();
        FileWriter f1 = new FileWriter(output);
        PrintWriter p1 = new PrintWriter(f1);
        FileReader r1 = new FileReader(output);
        BufferedReader b1 = new BufferedReader(r1);
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        p.println(s);
        p.close();

        String s1 = b.readLine();
        String[] s2=s1.split(" ");
        int h=0;
        int sm=0;
        for(String w:s2)
        {
            if(w.equals("happy") || w.equals("good"))
            {
                h++;
                p1.println("pos");

                break;
            }
            else if(w.equals("sad")|| w.equals("terrible"))
            {
                sm++;
                p1.println("neg");
                break;
            }
        }
        if(h==0 && sm==0)
        {
            p1.println("Neutral");
        }
        p1.close();
        System.out.println(b1.readLine());
        b1.close();
        in.close();
    }
}

