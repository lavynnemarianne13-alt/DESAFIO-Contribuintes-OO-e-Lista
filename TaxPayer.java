public class TaxPayer {

    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpeding, double educationSpeding){
        this.salaryIncome=salaryIncome;
        this.servicesIncome=serviceIncome;
        this.capitalIncome=capitalIncome;
        this.healthSpending=healthSpeding;
        this.educationSpending=educationSpeding;
    }
    public double salaryTax(){ //imposto sobre o salario
        if(salaryIncome < 3000.0){
            return salaryIncome*0.0;
        }else if(salaryIncome < 5000.0){
            return salaryIncome * 0.10;
        }else {
            return salaryIncome * 0.20;
        }
    }
    public double serviceTax(){ //imposto sobre servicos
        return servicesIncome * 0.15;
    }
    public double capitalTax(){ //imposto sobre o capital
        return capitalIncome * 0.20;
    }
    public double grossTax(){ //imposto bruto
        return salaryTax()+serviceTax()+capitalTax();
    }
    public double taxRebate(){ //reembolso de imposto
        double total_gastos=healthSpending+educationSpending;
        double percentage = (total_gastos/grossTax());
        if(percentage>=0.30){
            return grossTax()*0.30;
        }else{
            return (grossTax()*percentage);
        }
    }
    public double netTax(){ //imposto liquido
        return grossTax()-taxRebate();
    }
    public double getSalaryIncome() {
        return salaryIncome;
    }
    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }
    public double getServiceIncome() {
        return servicesIncome;
    }
    public void setServiceIncome(double serviceIncome) {
        this.servicesIncome = serviceIncome;
    }
    public double getCapitalIncome() {
        return capitalIncome;
    }
    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }
    public double getHealthSpeding() {
        return healthSpending;
    }
    public void setHealthSpeding(double healthSpeding) {
        this.healthSpending = healthSpeding;
    }
    public double getEducationSpeding() {
        return educationSpending;
    }
    public void setEducationSpeding(double educationSpeding) {
        this.educationSpending = educationSpeding;
    }

    @Override
    public String toString() {
        return String.format("\nImposto bruto total: %.2f\n",grossTax())+
                String.format("Abatimento: %.2f\n",taxRebate())+
                String.format("Imposto devido: %.2f",netTax());
    }
}
