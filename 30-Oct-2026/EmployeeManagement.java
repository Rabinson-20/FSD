package Oct30;

import java.util.*;
public class EmployeeManagement {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<Employee> list = new ArrayList<>();

        // 2. HashMap for Department
        HashMap<Integer, String> dept = new HashMap<>();

        dept.put(1, "CSE");
        dept.put(2, "IT");
        dept.put(3, "ECE");

        // 3. Add Employee Records
        list.add(new Employee(101, "Arun", 1, 25000));
        list.add(new Employee(102, "Ravi", 2, 30000));
        list.add(new Employee(103, "Vijay", 3, 20000));
        list.add(new Employee(104, "Ajay", 1, 40000));
        list.add(new Employee(105, "Priya", 2, 35000));

        // 4. Display All Employees
        System.out.println("All Employee Details:");

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            e.display();
        }

        // 5. Search Employee
        int searchId = 102;
        boolean found = false;

        for (Employee e : list) {

            if (e.id == searchId) {
                System.out.println("Employee Found:");
                e.display();
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Employee Not Found");
        }

        // 6. Remove Employee
        int removeId = 103;

        Iterator<Employee> itr2 = list.iterator();

        while (itr2.hasNext()) {

            Employee e = itr2.next();

            if (e.id == removeId) {
                itr2.remove();

                System.out.println("Employee Removed: " + e.name);
                break;
            }
        }

        // 7. Department-wise Display
        System.out.println("\nDepartment-wise Employees:");

        for (int d : dept.keySet()) {

            System.out.println("\nDepartment: " + dept.get(d));

            for (Employee e : list) {

                if (e.deptId == d) {
                    System.out.println(e.name);
                }
            }
        }

        // 8. Sort Employees by Salary
        Collections.sort(list, new Comparator<Employee>() {

            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\nEmployees Sorted by Salary:");

        for (Employee e : list) {
            e.display();
        }

        // 9. Highest Salary
        Employee highest = list.get(list.size() - 1);

        System.out.println("Highest Salary Employee:");

        highest.display();

        // 10. Check Department ID
        int checkId = 1;

        if (dept.containsKey(checkId)) {
            System.out.println("Department Found: " + dept.get(checkId));
        } else {
            System.out.println("Department Not Found");
        }
    }
}

class Employee {

    int id;
    String name;
    int deptId;
    double salary;

    Employee(int id, String name, int deptId, double salary) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptId);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}