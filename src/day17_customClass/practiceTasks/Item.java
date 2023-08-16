package day17_customClass.practiceTasks;

public class Item {
    /*
    Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information of the item object
     */
    public String name;
    public int unitPrice;
    public int quantity;

    public void setInfoOfItem(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int calculateCost(){
        return (unitPrice*quantity);
    }

    public String toString() {
        return "Item{" +
                " Name='" + name + '\'' +
                ", Unit price=" + unitPrice +
                ", Quantity=" + quantity +
                "\nTotal full price of Item = $"+calculateCost()+
                '}';
    }
}
