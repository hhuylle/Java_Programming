package day29_inheritance.practiceTasks.phoneTask;

public class Phone {
    /*
    Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
				        setInfo():
				        call(long phoneNumber)
					    text(long phoneNumber)
					    toString(): prints Iphone object info when the object is passed in the print statement
     */
    private String brand, model;
    private double size, price;
    private String color;

    public void setInfo(String brand, String model, double size, double price, String color) {
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
        if (brand==null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be null/empty/blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null || model.isBlank() || model.isEmpty()){
            System.err.println("Model can not be null/empty/blank");
            System.exit(1);
        }

        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price==0){
            System.err.println("Price can not be zero");
            System.exit(1);
        }
        if (price<0){
            System.err.println("Price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            System.err.println("Color can not be null");
            System.exit(1);
        }
        if (color.isBlank()){
            System.err.println("Color can not be blank");
            System.exit(1);
        }
        if (color.isEmpty()){
            System.err.println("Color can not be empty");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" is texting "+phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
