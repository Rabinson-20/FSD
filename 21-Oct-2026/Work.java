package oops;

public class Work {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.display();
    }
}

class Person {
    String name = "Priya";
    int age = 30;
}

class Employee extends Person {
    int empId = 201;
    int salary = 50000;
}

class Manager extends Employee {
    String department = "IT";
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
