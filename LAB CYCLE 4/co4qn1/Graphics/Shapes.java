package Graphics;

interface Result
{
    void areaRectangle(float len,float br);
    void areaTriangle(float ba,float hei);
    void areaSquare(float side);
    void areaCircle(float r);

}

public class Shapes implements Result
{
    public void areaRectangle(float len,float br)
    {
        System.out.println("Area of Rectangle:"+(len*br));
    }
    public void areaTriangle(float ba,float hei)
    {
		System.out.println("Area of the triangle  ="+(0.5*ba*hei));
    }
    public void areaSquare(float side)
    {
		System.out.println("Area of the square ="+(side*side));
    }
    public void areaCircle(float r)
    {
        System.out.println("Area of Circle ="+3.14*r*r);
    }

    public static void main(String[] args) {
        
    }
}