public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * car's object with the make, model, year, and price
     *
     * @param make make of the car
     * @param model model of the car
     * @param year manufacture year of the car
     * @param price price of the car
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * this returns the make of the car
     *
     * @return the car's make
     */
    public String getMake() {
        return make;
    }

    /**
     * this sets the make of the car
     *
     * @param make the car's new make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * this returns the model of the car
     *
     * @return the car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * this sets the model of the car
     *
     * @param model the car's new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * this returns the year of the car.
     *
     * @return the car's manufacture year
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     *
     * @param year 
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     *
     * @return the car's price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     *
     * @param price the car's new price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}