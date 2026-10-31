package Oct30;

import java.util.*;
public class StudentManagementTask {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // 1. Add Student Records

        Student s1 = new Student(101, "Sam", "CSE", 85);
        Student s2 = new Student(102, "Rabinson", "IT", 90);
        Student s3 = new Student(103, "Zameer", "ECE", 78);
        Student s4 = new Student(104, "Shiyam", "CSE", 95);
        Student s5 = new Student(105, "Mani", "IT", 88);

        list.add(s1);
        set.add(s1.id);

        list.add(s2);
        set.add(s2.id);

        list.add(s3);
        set.add(s3.id);

        list.add(s4);
        set.add(s4.id);

        list.add(s5);
        set.add(s5.id);

        // 2. Display All Students

        System.out.println("All Student Details:");

        Iterator<Student> itr = list.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            s.display();
        }

        // 3. Duplicate Student ID Check

        int newId = 101;

        if (set.contains(newId)) {
            System.out.println("Duplicate Student ID: " + newId);
            System.out.println("Registration Not Allowed");
        } else {
            set.add(newId);
            System.out.println("Registration Successful");
        }

        // 4. Search Student

        int searchId = 102;
        boolean found = false;

        for (Student s : list) {

            if (s.id == searchId) {
                System.out.println("\nStudent Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Student Not Found");
        }

        // 5. Remove Student

        int removeId = 103;

        Iterator<Student> itr2 = list.iterator();

        while (itr2.hasNext()) {

            Student s = itr2.next();

            if (s.id == removeId) {
                itr2.remove();
                set.remove(removeId);

                System.out.println("Student Removed: " + removeId);
                break;
            }
        }

        // 6. Display After Removal

        System.out.println("\nAfter Removing Student:");

        for (Student s : list) {
            s.display();
        }

        // 7. Highest Marks Student

        Collections.sort(list, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks;
            }
        });

        System.out.println("Topper Details:");

        list.get(0).display();
    }
}

class Student{

    int id;
    String name;
    String department;
    int marks;

    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}