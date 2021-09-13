class parent {
    void show() {
        System.out.println("parent");
    }
}

class child extends parent {
    @Override
    void show() {
        System.out.println("Child");
    }

    void showChild() {
        System.out.println("show Class Unique Method");
    }
}

public class upanddowncasting {
    public static void main(String[] args) {  //Upcasting  only reference methods in child class which are directly in parent class
        parent obj1 = new child(); // referencing child class
        obj1.show(); //calling method show of the child class hence expecting to print "System.out.println("Child")"
    }
}