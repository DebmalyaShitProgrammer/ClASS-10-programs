/**
 * Design a class Point with data members x & y of float type.
 * Methods:-- 
 * 1) void getpoint (float a, float b),
 * 2) float distance ( point p) [ √{(x2 – x1)² – (y2-y1)²} ]
 * 3) point midpoint ( point p) -> to find midpoint
 * 4) void create() -> will create two point objects and will call distance(), midpoint() and getpoint() methods.
 *
 * Debmalya Bose
 * 26.4.2024
 */
class Point
{
    float x, y;

    void getpoint(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    float distance(Point P)
    {
        float dx = P.x - x;
        float dy = P.y - y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    Point midpoint(Point p)
    {
        float tx = (x + p.x)/2;
        float ty = (y + p.y)/2;
        Point temp = new Point();
        temp.x = tx;
        temp.y = ty;
        return temp;
    }

    void create()
    {
        Point A = new Point();
        Point B = new Point();

        float dist = A.distance(B);
        System.out.println("Distance between points: " + dist);

        Point midp = A.midpoint(B);
        System.out.println("Midpoint of points: (" + midp.x + ", " + midp.y + ")");
    }
}
