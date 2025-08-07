import java.util.*;
import java.io.*;
class Person implements Serializable
{
    int n;

    public Person(int n )
    {
        this.n=n;
    }

    public void calculate()
    {
        if(n<=2)
        {
            System.out.println("kid");
        }
        else{
            System.out.println("adult");
        }
    }
}


public class y12 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int age = in.nextInt();
        Person p = new Person(age);
        p.calculate();
        try(FileOutputStream f = new FileOutputStream("person.ser");
        ObjectOutputStream w = new ObjectOutputStream(f))
        {
            w.writeObject(p);

        }
        catch(IOException e)
        {
            System.out.println("invalid");
        }
        
        try(FileInputStream f1 = new FileInputStream("person.ser");
            ObjectInputStream w1 = new ObjectInputStream(f1))
            {
                Person p1 = (Person) w1.readObject();
                p1.calculate();
            }
            catch(IOException e)
            {
                System.out.println("invalid input");
            }
            in.close();


    }
}
