import java.util.*;
public class p15 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            ar.add(in.nextLine());
        }
        String s = in.nextLine();
        Iterator itr = ar.iterator();
        int c=0;
        while(itr.hasNext())
        {
            if(s.equals(itr.next())){
                c++;
            }
            

        }
        System.out.println(c);
        in.close();

    }
    
}
