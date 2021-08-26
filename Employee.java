public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Sorry! Salary cannot be 0 or less");
    }
    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <=0)
            throw new IllegalArgumentException("HourlyRate cannot be 0 or -ve");
        this.hourlyRate = hourlyRate;
    }
}