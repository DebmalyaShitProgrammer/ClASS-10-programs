
/**
 * WAP using mathematical functions to create a trigonometric value chart of degrees 
 * 0o, 30o, 45o, 60o, 90o of sin, cos, tan
 *
 * Debmalya Bose
 * 26.4.2024
 */
import java.text.DecimalFormat;
public class Program3
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nTrig\t0\t30\t45\t60\t90\n");

        for(int i = 1; i<=3; i++)
        {
            if(i==1) 
                System.out.print("Sin\t");
            else if(i==2) 
                System.out.print("Cos\t");
            else 
                System.out.print("Tan\t");

            for(int theta = 0; theta<=90; theta+=15)
            {
                if(theta == 15 || theta == 75)
                    continue;
                else
                {
                    double angle = Math.toRadians(theta);

                    if(i==1)
                        System.out.print(df.format(Math.sin(angle))+"\t");
                    else if(i==2)
                        System.out.print(df.format(Math.cos(angle))+"\t");
                    else
                    {
                        if(angle == Math.toRadians(90))
                        {
                            System.out.print("Undefined");
                        }
                        else
                        {
                            System.out.print(df.format(Math.tan(angle))+"\t");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}