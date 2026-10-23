package ac.rca.oop.encapsulation;

public class Laptop {
    //    private int serialNumber;
//    public String manufacturer;
//    public String model;
//    public int manufacturedDate;
//
//    public Laptop(){}
//
//    public Laptop(int serialNumber, String manufacturer, String model, int manufacturedDate){
//        this.serialNumber =serialNumber;
//        this.manufacturer=manufacturer;
//        this.model=model;
//        this.manufacturedDate=manufacturedDate;
//    }
//
//    public void setSerialNumber(int serialNumber){
//        this.serialNumber=serialNumber;
//    }
//    public int getSerialNumber(){
//        return this.serialNumber;
//    }
//    public String toString(){
//        return "The Laptop's details are: S/N " + this.getSerialNumber()+
//                ", Manufacturer: "+this.manufacturer+
//                ", Model: "+this.model+
//                ", Year: " +this.manufacturedDate;
//    }
    private int serialNumber;
    private String manufacturer;
    private String model;
    private int manufacturedYear;

    public Laptop() {
    }

    public Laptop(int serialNumber, String manufacturer, String model, int manufacturedYear) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufacturedYear = manufacturedYear;
    }

    public Laptop(int serialNumber, String manufacturer, String model) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "serialNumber=" + serialNumber +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}
