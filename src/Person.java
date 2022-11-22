import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Animal[] animal;
    private Transport[] transport;

    public Person(String name, int age, Animal[] animal, Transport[] transport) {
        this.name = name;
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Age can not be negative.");
        }
        this.animal = animal;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal[] getAnimal() {
        return animal;
    }

    public void setAnimal(Animal[] animal) {
        this.animal = animal;
    }

    public Transport[] getTransport() {
        return transport;
    }

    public void setTransport(Transport[] transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + Arrays.toString(animal) +
                ", transport=" + Arrays.toString(transport) +
                '}';
    }
}
