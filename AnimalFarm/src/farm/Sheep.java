package farm;

public class Sheep extends Milking{
    public Sheep(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }

    public String bleat() {
        return "Bleating";
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
}
