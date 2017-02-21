import java.text.NumberFormat;

/**
 * Created by anthonymparker on 2/16/17.
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    public Car() {

        make = "";
        model = "";
        year = 0;
        price = 0.0;

    }

    public Car(String make, String model, int year,
               double price) {
        //taking arguments
        //storing their values in the instance variables
        //because the local variables/arguments will run out of scope
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public String toString(){
        return   "\n" + make +  model + "\t" + year + "\t"  + (nf.format(price));

    }
}