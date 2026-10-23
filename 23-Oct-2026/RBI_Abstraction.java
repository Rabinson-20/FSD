package Oct23;

public class RBI_Abstraction {
    public static void main(String[] args) {
        SBI s = new SBI();

        s.carLoan();
        s.housingLoan();
        s.educationsLoan();
        s.agriLoan();
    }
}

abstract class RBI {
    private final void deposit() {
        System.out.println("Deposit Method");
    }

    private final void withdrawal() {
        System.out.println("Withdrawal Method");
    }

    abstract void educationsLoan();

    abstract void agriLoan();
}

class SBI extends RBI {
    void carLoan() {
        System.out.println("Car Loan ROI: 11.25%");
    }

    void housingLoan() {
        System.out.println("Housing Loan ROI: 12%");
    }

    @Override
    void educationsLoan() {
        System.out.println("Education Loan ROI: 20%");
    }

    @Override
    void agriLoan() {
        System.out.println("Agriculture Loan ROI: 7%");
    }
}