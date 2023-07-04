public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("The engine has been started");
    }

    public void clean() {
        System.out.println("Car has been cleaned");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " + fuelSource);
    }
}
