public class main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(0x14);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }


}