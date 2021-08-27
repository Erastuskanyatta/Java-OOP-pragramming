public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate ){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Sorry! Salary cannot be 0 or less");
    }
    private  int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <=0)
            throw new IllegalArgumentException("HourlyRate cannot be 0 or -ve");
        this.hourlyRate = hourlyRate;
    }
}