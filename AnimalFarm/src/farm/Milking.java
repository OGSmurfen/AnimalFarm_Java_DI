package farm;

public abstract class Milking extends Animal implements Milky{
    private double quantity;
    private double maxQuantity;

    public Milking(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower);
        this.maxQuantity = maxQuantity;
    }

    public void setQuantity(double quantity) { this.quantity = quantity; }
    public double getQuantity() { return quantity; }
    public double getMaxQuantity() {  return maxQuantity; }
    public boolean start()
    {
        
        return true;
    }

    public boolean progress()
    {
        return false;
    }

    public boolean stop()
    {
        return false;
    }
}
