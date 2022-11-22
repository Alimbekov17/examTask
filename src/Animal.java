public abstract class Animal implements AnimalInterface{
    private String name;
    private int livingTime;
    private int speed;
    private AnimalType animalType;

    public Animal(String name, int livingTime, int speed, AnimalType animalType) {
        if (name.length() > 3){
            this.name = name;
        } else {
            System.out.println("Animal name must be at least 3 letters");
        }
        this.livingTime = livingTime;
        this.speed = speed;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLivingTime() {
        return livingTime;
    }

    public void setLivingTime(int livingTime) {
        this.livingTime = livingTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", livingTime=" + livingTime +
                ", speed=" + speed +
                ", animalType=" + animalType +
                '}';
    }
}
