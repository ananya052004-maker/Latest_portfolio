import java.util.*;
import java.util.Map.Entry;
public class er{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedHashMap<String, Integer> a=new LinkedHashMap<>();
        boolean d=true;
        int max=0;
        while(d==true){
            String s=in.nextLine();
            if(s.equals("done")){
                d=false;
            }
            else{
                String[] s1=s.split(":");
                try{
                    int i=Integer.parseInt(s1[1]);
                    if(i>max){
                        max=i;
                    }
                    a.put(s1[0],i);
                }catch(NumberFormatException e){
                    System.out.println("Invalid Input");
                }
            }
        }
        String key=null;
        for( Entry<String, Integer> entry: a.entrySet()){
            if (entry.getValue()==max) {
                key = entry.getKey();
                break; 
        }
        }
        System.out.println(key);
    }
}
