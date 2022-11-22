public abstract class Transport implements TransportInterface{
    private String name;
    private int year;
    private TransportType transportType;

    public Transport(String name, int year, TransportType transportType) {
        this.name = name.toUpperCase();
        if (year > 2018){
            this.year = year;
        } else {
            System.out.println("Transport is old.");
        }
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", transportType=" + transportType +
                '}';
    }
}
