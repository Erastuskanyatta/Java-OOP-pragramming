public class main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(-1);
        employee.setHourlyRate(4);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }


}