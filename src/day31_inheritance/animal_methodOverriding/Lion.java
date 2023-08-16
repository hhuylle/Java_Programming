package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public void eat() {
        System.out.println("Lion "+getName()+" is eating zebra");
    }

    public void hunt(){
        System.out.println("Lion "+getName()+" is hunting");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

    public String toString() {
        /* option1
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getAge() + '\'' +
                ", color='" + getColor() + '\'' +
                ", African lion=" + isAfricanLion +
                '}';

         */
        // option2
        return super.toString().replace("}","")+
                ", African lion=" + isAfricanLion + '\'' +
                '}';
    }
}
