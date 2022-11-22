import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = {
                new Horse("Mars", 5, 170, AnimalType.DOMESTIC_ANIMAL),
                new Horse("Aigyr", 3, 180, AnimalType.DOMESTIC_ANIMAL),
                new Horse("Tulpar", 6, 180, AnimalType.DOMESTIC_ANIMAL),
                new Tiger("Tiger", 4, 190, AnimalType.WILD_ANIMAL),
                new Tiger("Tiger", 3, 205, AnimalType.WILD_ANIMAL),
                new Tiger("TigerAdyl", 1, 150, AnimalType.WILD_ANIMAL),
                new Eagle("AdylEagle", 1, 199, AnimalType.DOMESTIC_ANIMAL),
                new Eagle("AdylEagle2", 2, 195, AnimalType.DOMESTIC_ANIMAL),
                new Eagle("Jazy", 2, 200, AnimalType.DOMESTIC_ANIMAL)
        };
        Transport[] transports = {
                new Bus("Bus1", 2020, TransportType.ROAD_TRANSPORT),
                new Bus("Bus2", 2021, TransportType.ROAD_TRANSPORT),
                new Bus("BusUson", 2019, TransportType.ROAD_TRANSPORT),
                new Helicopter("Apachi", 2023, TransportType.AIR_TRANSPORT),
                new Helicopter("UsonHelicopter", 2020, TransportType.AIR_TRANSPORT),
                new Helicopter("AdylHelicopter", 2022, TransportType.AIR_TRANSPORT),
                new Boat("BoatUson", 2022, TransportType.WATER_TRANSPORT),
                new Boat("AdylBoat", 2020, TransportType.WATER_TRANSPORT)
        };

        System.out.println("Enter:");
        String enteredName = scanner.next();
        method1(animals, transports, enteredName);
        System.out.println("Animals: ");
        method2(animals);
        System.out.println("Transports");
        method3(transports);




    }
    public static void method1(Animal[] animals, Transport[] transports, String name){
        Animal[] asanAnimals = {animals[0], animals[3], animals[6]};
        Transport[] asanTransports = {transports[0], transports[1], transports[3]};
        Animal[] usonAnimals = {animals[4], animals[1], animals[2]};
        Transport[] usonTransports = {transports[1], transports[4], transports[6]};
        Animal[] adylAnimals = {animals[5], animals[7], animals[8]};
        Transport[] adylTransports = {transports[5], transports[7]};

        Person asan = new Person("Asan", 25, asanAnimals, asanTransports);
        Person uson = new Person("Uson", 24, usonAnimals, usonTransports);
        Person adyl = new Person("Adyl", 30, adylAnimals, adylTransports);

        switch (name) {
            case "Adyl" -> System.out.println(adyl);
            case "Asan" -> System.out.println(asan);
            case "Uson" -> System.out.println(uson);
            default -> System.out.println("no such name");
        }
    }
    public static void method2(Animal[] animals){
        for (Animal animal: animals) {
            animal.run();
            if (animal.getClass().equals(Horse.class)){
                animal.eat("Grass");
                Horse[] horses = {(Horse) animal};
            } else if (animal.getClass().equals(Tiger.class)){
                Tiger[] tigers = {(Tiger) animal};
                animal.eat("Deer");
            } else if (animal.getClass().equals(Eagle.class)){
                Eagle[] eagles = {(Eagle) animal};
                animal.eat("Rabbit");
            }
        }
    }
    public static void method3(Transport[] transports){
        for (Transport transport: transports) {
            if (transport.getClass().equals(Bus.class)){
                transport.fuelConsumption("diesel", 100);
                transport.capacity(70);
                Bus[] buses = {(Bus) transport};
            } else if (transport.getClass().equals(Boat.class)){
                transport.fuelConsumption("nafta", 200);
                transport.capacity(30);
                Boat[] boats = {(Boat) transport};
            } else if (transport.getClass().equals(Helicopter.class)){
                transport.fuelConsumption("kerosene", 300);
                transport.capacity(20);
                Helicopter[] helicopters = {(Helicopter) transport};
            }
        }
    }
}