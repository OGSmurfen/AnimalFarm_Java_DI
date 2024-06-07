package farm;

public class Cage extends Building{
    private Animal animal;
    public Cage(double height, double width, double length) {
        super(width, length, height);
    }
    public Animal getAnimal(){
        return animal;
    }
    public boolean accomodation(Animal animal) {
        if (animal == null) {
            this.animal = animal;
            return true;
        }
        return false;
    }
    public boolean release(){
        animal = null;
        return animal==null;
    }
}
