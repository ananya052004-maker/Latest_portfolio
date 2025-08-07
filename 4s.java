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


public class 4s 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        FileOutputStream f = new FileOutputStream("person.ser");
        ObjectOutputStream w = new ObjectOutputStream(f);
        FileInputStream f1 = new FileInputStream("person.ser");
        ObjectInputStream w1 = new ObjectInputStream(f1);
        int age = in.nextInt();
        Person p = new Person(age);
        p.calculate();
        w.writeObject(p);
        Person p1 = (Person)w1.readObject();
        p1.calculate();
        in.close();
        


    }
}
