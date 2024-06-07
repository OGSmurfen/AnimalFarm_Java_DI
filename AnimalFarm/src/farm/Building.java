package farm;

import jdk.jshell.spi.ExecutionControl;

public class Building implements Volume{
    private Dimensions dimension;
    public Building(double width, double length, double height)
    {
        dimension = new Dimensions(width, length, height);
    }
    public double getWidth() { return dimension.getWidth(); }
    public double getLength() { return dimension.getLength(); }
    public double getHeight() { return dimension.getHeight(); }
    public double calculate()
    {
        return  dimension.getWidth()*dimension.getLength()*dimension.getHeight();
    }
}
