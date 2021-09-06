public class main {
    public static void main(String[] args) {
//        new Employee(20_000);
        var employee = new Employee(50_000,
                20); //passing argument from the constructor
//        employee = new Employee(50_000, 20);
//        employee.setBaseSalary(20_000);
//        employee.setHourlyRate(10);
//        employee.baseSalary = 10;

//        employee.hourlyRate= -1;
//        System.out.println(employee.baseSalary);
//        System.out.println(Employee.numberOfEmployee);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(0);
        System.out.println(wage);

    }


}