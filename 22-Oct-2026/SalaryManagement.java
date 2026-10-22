package oops;

public class SalaryManagement {
	public static void main(String[] args) {
		Employee p=new Permanant(101, "Sam", 35000);
        Employee c=new Contract(102, "Rabinson", 25000);
        p.calculateSalary();
        System.out.println();
        c.calculateSalary();

	}
}
class Employee{
	int empid;
	String name;
	double salary;
	Employee(int id, String n, double s){
		empid=id;
		name=n;
		salary=s;
	}
	void calculateSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Permanant extends Employee{
	Permanant (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
		double s= salary+(salary*20/100);
		System.out.println("Permanent Employee");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + s);
    }
}
class Contract extends Employee{
	Contract (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
        double s = salary + 2000;
        System.out.println("Contract Employee");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + s);
    }
}