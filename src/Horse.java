import java.time.LocalDate;

public class Horse extends Animal{
    public Horse(String name, int livingTime, int speed, AnimalType animalType) {
        super(name, livingTime, speed, animalType);
    }

    @Override
    public void run() {
        System.out.println(getName() + " can run at a speed of: " + getSpeed() + "km/h.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public LocalDate live() {
        return null;
    }
}
