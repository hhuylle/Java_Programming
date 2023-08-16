package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // StudentsGroup HAS a Student
    /*
    Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
     */
    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { // constructor creates the StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>(); // size is 0
    }

    public void addStudent(Student student){ // to add one student object to the Students arraylist
        students.add(student);
    }

    public void addStudent(String name, int age, char gender, String id){ // add one student with name,age,gender,id of student object by using given info
       //Student student = new Student(name, age, gender, id);
       students.add(new Student(name, age, gender, id));
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students)); // add one array of students to the arraylist students
    }

    public void removeStudent(String id){ // remove student object with id info that given
        students.removeIf(p-> p.id.equals(id));
    }

    public String toString() { // to display the objects
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
