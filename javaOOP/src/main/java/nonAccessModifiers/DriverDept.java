package nonAccessModifiers;

public class DriverDept {

    public  static void main(String args[]) {
        DepOne  attendance = new DepOne();
        int emp =  attendance.getEmployee();
        System.out.println("This department has " + emp + " employees" );
        attendance.attendance();

    }
}
