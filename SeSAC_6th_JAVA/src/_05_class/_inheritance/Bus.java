package _05_class._inheritance;

public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    void transport() {
        System.out.println("승객을 운송합니다.");
    }


    public String toString(String vehicle) {
        return "========" + vehicle + "정보" + "========" +
                "\nBus {" +
                "brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
