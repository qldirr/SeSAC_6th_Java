package _05_class._inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void startEngine(){
        System.out.println("차량 시동을 걸었습니다.");
    }

    void stop(){
        System.out.println("차량을 정지했습니다.");
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai", "City bus", 2022);
        bus.setPassengerCapacity(30);
        System.out.println(bus.toString("Bus"));
        bus.startEngine();
        bus.transport();
        bus.stop();

        Car car = new Car("Toyota", "Camry", 2023);
        car.setConvertible(true);
        System.out.println(bus.toString("Car"));
        car.startEngine();
        car.parking();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.setLicenseType("A");
        System.out.println(motorcycle.toString("Motorcycle"));
        motorcycle.startEngine();
        motorcycle.soundBox();
        motorcycle.stop();
    }
}
