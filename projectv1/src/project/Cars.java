package project;

public class Cars {
    private static int counter = 1;

    private String manufacturer;
    private String model;
    private int plate;

    public Cars(String manufacturer, String model, int plate){
        this.manufacturer = manufacturer;
        this.model = model;
        this. plate = plate;
        counter += 1;
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getPlate(){
        return plate;
    }
    public void setPlate(int plate){
        this.plate = plate;
    }
    public String toString(){
        return "\nFabricante: " + this.getManufacturer() +
                "\nModelo: " + this.getModel() +
                "\nPlaca: " + this.getPlate() +
                "\n";

    }

}
