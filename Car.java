public class Car {
    private String model;
    private int buildYear;
    private float comsuption;
    private String color;
    private double carSpeed;
    private int carSeat;

    public void setModel(String modelValue) {
        this.model = modelValue;
    }

    public String getModel() {
        return this.model;
    }

    public void setBuildYear(int year) {
        this.buildYear = year;
    }

    public int getBuildYear() {
        return this.buildYear;
    }

    public void setConsumption(Float fuel) {
        this.comsuption = fuel; 
    }

    public Float getConsumprtion() {
        return this.comsuption;
    }

    public void setColor(String carColor) {
        this.color = carColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setCarSpeed(double speed) {
        this.carSpeed = speed;
    }

    public double getCarSpeed() {
        return this.carSpeed;
    }

    public void setCarSeat(int seat) {
        this.carSeat = seat;
    }

    public int getCarSeat() {
        return this.carSeat;
    }

    public void printInConsole() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Bulid Year: " + this.getBuildYear());
        System.out.println("Consumption amount: " + this.getConsumprtion() + " per Km");
        System.out.println("Car color: " + this.getColor());
        System.out.println("Car speed: " + this.getCarSpeed() + " km/h");
        System.out.println("Number of Seats: " + this.getCarSeat());
        System.out.println();
    }
}
