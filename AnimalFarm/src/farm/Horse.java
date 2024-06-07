package farm;

public class Horse extends Animal implements Freight{
    public Horse(double width, double length, double height, double maxPower) {
        super(width, length, height, maxPower);
    }

    @Override
    public void eat() {
        double power = getPower();
        double maxPower = getMaxPower();
        if(power <= maxPower){
            power += 0.05 * maxPower;
        }
        setPower(power);
    }

    public String neigh(){
        return "Neighing";
    }
    @Override
    public void work() {
        double power = getPower();
        double fiftyPercentOfPower = power/2;
        power -= fiftyPercentOfPower;
        setPower(power);
    }
}
