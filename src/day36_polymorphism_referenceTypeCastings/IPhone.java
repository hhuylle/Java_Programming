package day36_polymorphism_referenceTypeCastings;

import java.util.Arrays;

public class IPhone {

    private String brand, model, size;
    private double price;
    private String color;

    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0){
            System.out.println("Price can not be zero or negative "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        /*
        boolean validColor = color=="Black"|| color=="White" || color=="Silver" || color=="Gold" || color=="Pink";
        if (validColor){
            this.color = color;
        }else {
            System.out.println("Invalid color");
            System.exit(1);
        }
        */
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink","Red","Blue","Green"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("Invalid color: " +color+"\n color can only be: "+Arrays.toString(colors));
            System.exit(1);
        }
    }

    public void call(long phoneNumber){
        System.out.println(getModel()+ " is calling number "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting to number "+phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // Equal method

        if (!(obj instanceof IPhone)){
            System.err.println("Invalid object! \nObject must be IPhone");
            System.exit(1);
        }

        if (obj instanceof IPhone){ // if the given object is IPhone
            if (model.equals( ((IPhone) obj).model) ){ // if the model of IPhone is equal to the given IPhone's model
                /*
                if (color.equals( ((IPhone) obj).color) ){ // if the IPhone's color is equal to the given IPhone's color

                }
                 */
                return true;
            }
        }

        return false;

    }
}
