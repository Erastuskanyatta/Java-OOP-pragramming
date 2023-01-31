package nonAccessModifiers;

public abstract class Department {

    public  abstract  int getEmployee();

    public  abstract void  employeeNumber();

    public void attendance(){
        System.out.println("I am present today!");
    }
}

class  DepOne extends Department{

    @Override
    public int getEmployee() {
        return 200;
    }

    @Override
    public void employeeNumber() {
        System.out.println("This is implementation of the abstract methods");

    }
}