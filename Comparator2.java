import java.util.List;      
import java.util.ArrayList;     
import java.util.Collections;   
import java.util.Comparator;    // Comparator interface

// Class definition for Student
class Student {
    int age;       
    String name;   
    
    // Constructor to initialize age and name
    public Student(int age, String name) {
        this.age = age; 
        // Initializing age
        this.name = name;   
        // Initializing name
    }
   
    // Overriding the toString() method to return a formatted string representation of Student
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

// Main class
public class Comparator2 {
    // Main method to start the program
    public static void main(String args[]) {
        // Creating a Comparator instance using an anonymous inner class
        Comparator<Student> com = new Comparator<Student>() {
            // Overriding the compare method of Comparator to define custom comparison logic
            public int compare(Student i, Student j) {
                // Comparing two Student objects based on their age
                // If age of i is greater than age of j, return 1
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;    // If age of i is not greater than age of j, return -1
                }
            }
        };
        
        // Creating a List to store Student objects
        List<Student> stud = new ArrayList<>();
        
        // Adding Student objects to the List
        stud.add(new Student(25, "sai"));
        stud.add(new Student(19, "Jaswanth"));
        stud.add(new Student(20, "Samba"));
        
        // Sorting the List of Student objects based on age using the Comparator
        Collections.sort(stud, com);
        
        // Printing the sorted List of Student objects
        for (Student s : stud) {
            System.out.println(s);
        }
    }
}
