public class main {
    public static void main(String[] args){
        var calculator = new TaxCalculator2018(10_000);
        var report = new TaxReport(calculator);
        report.show();
        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}