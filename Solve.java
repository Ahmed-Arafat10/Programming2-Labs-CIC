class Circle{
    public int r;
    Circle(int x)
    {
        this.r = x;
    }
}
public class Solve {

    public static void sovle(Circle c,int x)
    {
        c.r = x;
    }
    public static void main(String str[])
    {
        Circle mycir = new Circle(10);
        sovle(mycir,50);
        System.out.print(mycir.r);
    }
}
