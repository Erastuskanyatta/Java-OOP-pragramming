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
    public static void main(String[] args) {  //Downcasting
        parent obj1 = new child();
        if (obj1 instanceof child){
            child obj2 = (child)obj1; // creating object2 using object 1
            obj2 .showChild();
        }

    }
}