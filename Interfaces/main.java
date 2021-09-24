public class main {
    public static void main(String[] args){
        var calculator = new TaxCalculator2018(60000);
        var report = new TaxReport();
        report.show(calculator);
//        report.setCalculator(new TaxCalculator2019());
        report.show(new TaxCalculator2019());

    }
}