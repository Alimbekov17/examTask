public class Helicopter extends Transport implements Flyable{
    public Helicopter(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fuelConsumption(String fuel, int liter) {
        System.out.println(getName() + ": " + fuel + ", " + liter);
    }

    @Override
    public void capacity(int place) {
        System.out.println(getName() + ": " + place + " sits.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly.");
    }
}
