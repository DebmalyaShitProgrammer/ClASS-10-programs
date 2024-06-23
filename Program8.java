
/**
 * Write a description of class Program8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program8
{
    void series(int n)
    {
        int a=1,b=1,c=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    
    void series(int x, int n)
    {
        double s = 0.0; int c=1;
        for(int i=1;i<=n;i++)
        {
            int f=1;
            for(int j=1;j<=i+1;j++) 
                f*=j;
            s+=Math.pow(x,i)/f*c;
            c*=-1;
        }
        System.out.println(s);
    }
    
    void main(String[] args)
    {
        series(4);
        series(5, 10);
    }
}