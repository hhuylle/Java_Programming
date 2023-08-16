package day26_statics.studentTask;

public class TestObjects {
    /*
    Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object students list
     */

    public static void main(String[] args) {

        Student student1 = new Student("Adam",21,'M',"A16");
        Student student2 = new Student("Ben",24,'M',"B34");
        Student student3 = new Student("Emma",22,'F',"C56");
        Student student4 = new Student("Tom",25,'M',"D43");
        Student student5 = new Student("Anna",23,'F',"E27");

        Student[] students = {student2,student3,student4,student5};

        StudentsGroup  group1 = new StudentsGroup("Java Turtles",1);

        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Jenny",28,'F',"F35");

        System.out.println(group1);

        group1.removeStudent("A16");
        System.out.println(group1);

        group1.removeStudent("E27");
        System.out.println(group1);

        for (Student each : group1.students) { // to print the object
            System.out.println(each.name +" : " +each.id);
        }

        StudentsGroup  group2 = new StudentsGroup("Java Turtles",2);
        StudentsGroup  group3 = new StudentsGroup("Java Turtles",3);
        StudentsGroup  group4 = new StudentsGroup("Java Turtles",4);
        StudentsGroup  group5 = new StudentsGroup("Java Turtles",5);

        StudentsGroup[] groups = {group1,group2,group3,group4};

    }
}
