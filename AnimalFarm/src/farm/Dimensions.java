package farm;

public class Dimensions {
    private double width;
    private double length;
    private double height;

    public Dimensions(double width, double length, double height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    protected double getWidth() {  return width; }
    protected double getLength() { return length; }
    protected double getHeight() { return height; }
}
