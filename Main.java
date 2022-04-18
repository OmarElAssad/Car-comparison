/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Here we start!");
        System.out.println();

        Car audi = new Car();
        audi.setModel("Audi");
        audi.setBuildYear(2021);
        audi.setConsumption(6.5f);
        audi.setColor("Blue");
        audi.setCarSpeed(410.54);
        audi.setCarSeat(5);
        audi.printInConsole();
       
        Car bmv = new Car();
        bmv.setModel("BMW");
        bmv.setBuildYear(2015);
        bmv.setConsumption(7.5f);
        bmv.setColor("White");
        bmv.setCarSpeed(420.33);
        bmv.setCarSeat(2);
        bmv.printInConsole();

        Car Mercedes = new Car();
        Mercedes.setModel("Mercedes");
        Mercedes.setBuildYear(2022);
        Mercedes.setConsumption(8.5f);
        Mercedes.setColor("Red");
        Mercedes.setCarSpeed(440.78);
        Mercedes.setCarSeat(7);
        Mercedes.printInConsole();
    }
}