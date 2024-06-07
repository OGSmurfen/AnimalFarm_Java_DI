package farm;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Barn extends Building{
    private Set<Cage> cages = new HashSet<>();//initialize ?????
    public Barn(double width, double length, double height) {
        super(width, length, height);

        double barnSize = calculate();
        Random random = new Random();
        int randomNumberOfCages = random.nextInt(10);
        double numberOfCages = barnSize/randomNumberOfCages;
        for(int i = 0; i <= numberOfCages; i++){
            cages.add(new Cage(getWidth(), getHeight(), getLength()/numberOfCages));
        }
    }

    public void addAnimal(Animal animal){
        for (Cage cage : cages) {
            if(cage.getAnimal() == null){
                cage.accomodation(animal);
                return;
            }
        }
    }
    public void removeAnimal(Animal animal){
        for (Cage cage : cages) {
            if(cage.getAnimal() == animal){
                cage.release();
            }
        }
    }
    public Set<Cage> getCages(){
        return cages;
    }
    public Set<Animal> getAnimals(){
        Set<Animal> allAnimals = new HashSet<>();//initialize ?????
        for (Cage cage : cages) {
            allAnimals.add(cage.getAnimal());
        }

        return allAnimals;
    }
    public boolean removeAll(){
        for (Cage cage : cages) {
            cage.release();
        }
        return true;
    }

}
