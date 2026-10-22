package oops;

public class ClassStatic {

    public static void main(String[] args) {

        System.out.println("Version: " + Demo.ver);
        Demo.car();
        Demo f = new Demo();
        f.bike();
        f.accert();
    }
}

class Demo {
    static String ver = "2.3.1";
    public void bike() {
        System.out.println("This is a bike class");
    }
    public final void accert() {
        System.out.println("This property belongs to government");
    }

    static void car() {
        System.out.println("This is a BMW");
    }
}