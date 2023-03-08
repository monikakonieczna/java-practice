package exercises.garbage_collector;

public class UseEmployee {

    public static void main(String[] args) {
        Employee A = new Employee("Monika", 28);
        Employee B = new Employee("Marcin", 36);
        Employee C = new Employee("Piotr", 65);

        A.show();
        B.show();
        C.show();
        A.showNextId();
        B.showNextId();
        C.showNextId();

        {
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc();
            System.runFinalization();
        }

        C.showNextId();
    }
}
