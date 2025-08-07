import java.util.*;
import java.io.*;
public class p10 {
    public static void main(String[] args) {
        try{
            File price = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\prices.txt");
            FileWriter f =new FileWriter(price);
            File tax = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\tax.txt");
            FileReader g = new FileReader(price);
            BufferedReader br=new BufferedReader(g);
            PrintWriter p = new PrintWriter(f);
            PrintWriter pr=new PrintWriter(tax);
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            double []a = new double[n];
            for(int i=0;i<n;i++)
            {
                a[i] = in.nextDouble();
                p.println(a[i]);
                    
            }
            p.close();
            String s=br.readLine();
            while(s!=null){
                double d=Double.parseDouble(s);
                double d1=d*1.1;
                double d2=Math.round(d1*100);
                double d3=d2/100.0;
                pr.println(d3);
                s=br.readLine();
            }
            pr.close();
            br.close();
            in.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }       
    }       
}
    

