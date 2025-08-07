import java.util.*;
import java.util.Map.Entry;
public class yui5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedHashMap<String, Double> a=new LinkedHashMap<>();
        boolean d=true;
        double sum=0.0;
        while(d==true){
            String s=in.nextLine();
            if(s.equals("done")){
                d=false;
            }
            else{
                String[] s1=s.split(":");
                try{
                    double i=Double.parseDouble(s1[1]);
                    sum+=i;
                    a.put(s1[0],sum);
                }catch(NumberFormatException e){
                    System.out.println("Invalid Input");
                }
            }
        }
        
        System.out.format("%.2f\n",sum);
        in.close();
    }
}
