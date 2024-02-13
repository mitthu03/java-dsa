class room1
{
    private int length;
    private int width;
    public void setLength(int l)
    {
        length=l;
    }

    public void setWidth(int w)
    {
        width = w;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public void show_data() {
        System.out.println("length = " + length);
        System.out.println("Width = " + width);
    }
}
class area
{
    public static void main(String[] as)
    {
        room r1=new room();
        r1.setLength(10);
        r1.setWidth(20);
       r1.getLength();
       r1.getWidth();
        r1.show_data();
        System.out.println("Area of rectangle = "+r1.getWidth()* r1.getLength());
    }
}
