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
        //sets milking flag to true
        return true;
    }

    public boolean progress()
    {
//        if(/*!milkingFlag*/){
//            return false;
//        }else
//        {
//            return true;
//        }
        while(quantity >= 0 /*&& milkingFlag*/) {
            quantity -= 0.07 * quantity;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (true){
                return true;
            }
        }
        return false;
    }

    public boolean stop()
    {
        //sets milking flag to false
        return false;
    }
}
