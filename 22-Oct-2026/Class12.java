package oops;

public class Class12 {

	public static void main(String[] args) {
		Sonn s1 = new Sonn();
        s1.displaySonn();
        System.out.println();
        Sonn s2 = new Sonn("Paul");
        s2.displaySonn();
	}
}
class Fatherr {
    Fatherr() {
        System.out.println("Father Default Constructor");
    }

    Fatherr(String name) {
        System.out.println("Father Name: " + name);
    }

    void displayFatherr() {
        System.out.println("I am Father");
    }
}

class Sonn extends Fatherr {

    Sonn() {
        super();
        System.out.println("Son Default Constructor");
    }

    Sonn(String name) {
        super(name);
        System.out.println("Son Parameterized Constructor");
    }

    void displaySonn() {
        super.displayFatherr();
        System.out.println("I am Son");
    }
}
