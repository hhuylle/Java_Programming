package day27_accessModifiers;

public class InstanceInistializationBlock {

    public String name;
    public int age;

    /*
    {
        name = "James";
        age = 24;
    }
    */

    public InstanceInistializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        /*
        InstanceInistializationBlock obj1 = new InstanceInistializationBlock();

        InstanceInistializationBlock obj2 = new InstanceInistializationBlock();

        System.out.println(obj1.name+" : "+ obj1.age);
        System.out.println(obj2.name+" : "+ obj2.age);
        */
        InstanceInistializationBlock obj1 = new InstanceInistializationBlock("James",29);
        InstanceInistializationBlock obj2 = new InstanceInistializationBlock("Anna",25);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
