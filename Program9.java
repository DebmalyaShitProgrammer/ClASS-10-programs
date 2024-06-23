
/**
 * Write a description of class Program9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program9
{
    int a, b;
    
    Program9()
    {}
    
    Program9(int a, int b)
    {
        if(a < 100 || b > 999)
        {
            System.out.println("Bad Input");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
    }
    
    void display()
    {
        for(int i = a; i <= b; i++)
            if(i == sum(i))
                System.out.println(i);
    }
    
    int sum(int x)
    {
        int s = 0;
        while(x > 0)
            s += (int) Math.pow(x%10, 3);
        return s;
    }
    
    void main()
    {
        Program9 obj = new Program9(100, 999);
        
        obj.display();
    }
}
