public class Employee {
    public int baseSalary;
    public int hourlyRate;
//    public  Employee(int baseSalary, int hourlyRate ){
//        setBaseSalary(baseSalary);
//        setHourlyRate(hourlyRate);
//    }
    public static int numberOfEmployee;
    public Employee(int baseSalary){
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
        // instead 👆 do 👇
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);



    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Sorry! Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {  // to reduve coupling, change modifier to private
        return baseSalary;
    }

    public int getHourlyRate() {  // to reduve coupling, change modifier to private
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {    //data validation for the constuctor
        if(hourlyRate <0)
            throw new IllegalArgumentException("hourlyRate cannot be 0 or less than 0");
        this.hourlyRate = hourlyRate;
    }
}

