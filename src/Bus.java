public class Bus extends Transport{
    public Bus(String name, int year, TransportType transportType) {
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
}
