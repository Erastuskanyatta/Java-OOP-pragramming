public class main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
//        employee.setBaseSalary(-1);
//        employee.setHourlyRate(4);
//        System.out.println(employee.baseSalary);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

//    public static void main(String[] args){
//        var browser = new Browser();
//        browser
//    }


}