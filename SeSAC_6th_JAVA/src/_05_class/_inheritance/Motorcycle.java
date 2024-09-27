package _05_class._inheritance;

public class Motorcycle extends Vehicle{
    private String licenseType;

    public Motorcycle(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public String  getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String  licenseType) {
        this.licenseType = licenseType;
    }

    void soundBox() {
        System.out.println("울림통을 합니다.");
    }


    public String toString(String vehicle) {
        return "========" + vehicle + "정보" + "========" +
                "\n"+vehicle+
                "{brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", licenseType=" + licenseType +
                '}';
    }
}
