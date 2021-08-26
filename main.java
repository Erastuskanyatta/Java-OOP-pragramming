public class main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(20);
        employee.setHourlyRate(0);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }


}