import java.time.LocalDate;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, int livingTime, int speed, AnimalType animalType) {
        super(name, livingTime, speed, animalType);
    }

    @Override
    public void run() {
        System.out.println(getName() + " can fly at a speed of: " + getSpeed() + "km/h.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public LocalDate live() {
        return null;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly high");
    }
}
