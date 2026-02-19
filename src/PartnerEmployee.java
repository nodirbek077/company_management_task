public class PartnerEmployee extends Employee{
    private String companyName;

    public PartnerEmployee() {
    }

    @Override
    public String getEmployeeType() {
        return "Partner";
    }

    public PartnerEmployee(String name, String surname, Double salary, String work, String companyName) {
        super(name, surname, salary, work);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.75;
    }

    @Override
    public Double calculatePensionTax() {
        return getSalary() * 0.05;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }
}
