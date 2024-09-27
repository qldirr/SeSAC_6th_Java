package _05_class._inheritance;

public class Car extends Vehicle{
    private boolean convertible;

    public Car(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    void parking() {
        System.out.println("주차했습니다.");
    }


    public String toString(String vehicle) {
        return "========" + vehicle + "정보" + "========" +
                "\n"+vehicle+
                "{brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", convertible=" + convertible +
                '}';
    }
}
