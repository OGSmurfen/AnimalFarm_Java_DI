package farm;

public class Cattle extends Milking implements Freight{

    public Cattle(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }


    @Override
    public void eat() {
        double power = getPower();
        double maxPower = getMaxPower();
        if(power <= maxPower){
            power += 0.05 * maxPower;
        }
        setPower(power);

        double quantity = getQuantity();
        double maxQuantity = getMaxQuantity();
        if(quantity <= maxQuantity){
            quantity += 0.05 * maxQuantity;
        }
        setQuantity(quantity);
    }
    public String moo() {
        return "Mooing";
    }
    @Override
    public void work() {
        double power = getPower();
        double fiftyPercentOfPower = power/2;
        power -= fiftyPercentOfPower;
        setPower(power);
    }
}
