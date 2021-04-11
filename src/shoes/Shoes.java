package shoes;

public class Shoes{
    private static int popularity;

    private String brand;
    private float price;
    private int size;
    private String color;

    private String name;
    private String countryManufacture;
    private String shoeCollection;
    private String material;
    private boolean isShoelace;

    protected int comfort;
    protected int reliability;

    public Shoes() {
        popularity += 1;
    }

    public Shoes(String brand, float price, int size, String color) {
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
        popularity += 1;
    }

    public Shoes(String brand, float price, int size, String color, String name, String countryManufacture, String shoeCollection, String material, boolean isShoelace, int comfort, int reliability) {
        this(brand, price, size, color);
        this.name = name;
        this.countryManufacture = countryManufacture;
        this.shoeCollection = shoeCollection;
        this.material = material;
        this.isShoelace = isShoelace;
        this.comfort = comfort;
        this.reliability = reliability;
    }

    //getters&setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryManufacture() {
        return countryManufacture;
    }

    public void setCountryManufacture(String countryManufacture) {
        this.countryManufacture = countryManufacture;
    }

    public String getShoeCollection() {
        return shoeCollection;
    }

    public void setShoeCollection(String shoeCollection) {
        this.shoeCollection = shoeCollection;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isShoelace() {
        return isShoelace;
    }

    public void setShoelace(boolean shoelace) {
        isShoelace = shoelace;
    }

    //methods

    public static void printStaticPopularity() {
        System.out.println("popularity from class: "+ popularity);
    }
    public void printPopularity(){
        System.out.println("popularity from object: "+ popularity);
    }

    public void resetValues(String brand, float price, int size, String color, String name, String countryManufacture, String shoeCollection, String material, boolean isShoelace, int comfort, int reliability){
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
        this.name = name;
        this.countryManufacture = countryManufacture;
        this.shoeCollection = shoeCollection;
        this.material = material;
        this.isShoelace = isShoelace;
        this.comfort = comfort;
        this.reliability = reliability;

    }

    @Override
    public String toString() {
        return "________________________" +
                "\n|Brand: " + brand +
                "|\n|Price: " + price +
                "|\n|Size: " + size +
                "|\n|Color: " + color +
                "|\n|Name: " + name +
                "|\n|Country Manufacture: " + countryManufacture +
                "|\n|Material: " + material +
                "|\n| Is shoelace " + isShoelace +
                "|\n| Comfort: " + comfort +
                "|\n| Reliability: " + reliability +
                "|\n________________________\n";
    }



}
