/**
 * Write a program to design a class Line with the following informations.
 * Data members => int x1, y1, x2, y2; double length;
 * Methods => 
 * i) Constructors to initialize data members .
 * ii) void distance()   => It will calculate and print distance (length) between these two points (x1, y1) and (x2, y2) for a line.
 * iii) void midpoint()  => It will calculate and print midpoint of these two points of a line.
 * iv) void display()    => Will display the data members.
 * v) Line compare(Line) => Will compare length of two lines and will return the Line object with maximum length.
 * vi) void main ()      => Will create two objects. Will calculate length of lines. Then it will find the Line with maximum length.
 *
 * Debmalya Bose
 * 25.5.2024
 */
public class Line
{
    int x1, y1, x2, y2; double length;
    
    Line() 
    {}
    
    Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    void distance()
    {
        double dx = x2 - x1;
        double dy = y2 - y1;
        length = Math.sqrt(dx*dx + dy*dy);
        System.out.print("Distance: " + length);
    }
    
    void midpoint()
    {
        double x = (x2+x1)/2;
        double y = (y2+y1)/2;
        System.out.print(x + ", " + y);
    }
    
    void display()
    {
        System.out.println("Point A(" + x1 + ", " + y1 + ")");
        System.out.println("Point B(" + x2 + ", " + y2 + ")");
    }
    
    Line compare(Line AB)
    {
        if(length > AB.length) 
            return this;
        else 
            return AB;
    }
    
    void main()
    {
        Line AB = new Line(0, 0, 5, 0);
        Line BC = new Line(0, 0, 10, 0);
        
        AB.distance();
        BC.distance();
        
        Line Max = AB.compare(BC);
        Max.display();
    }
}
