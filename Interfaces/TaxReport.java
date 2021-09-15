public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }
    public void show(){
        var tax = new calculate.calculateTax();
        System.out.println(tax);
    }
}