public class Employee {
    private Integer id;
    private String name;
    private String surname;
    private Double salary;
    private String work;

    public Employee(Integer id, String name, String surname, Double salary, String work) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.work = work;
    }

    public String getDetail() {
        return null;
    }

    public String getEmployeeType() {
        return "Employee";
    }

    public Double getOneTimeBonus() {
        return 0.0; // in dollar
    }

    public Double getHolidayBonus() {
        return 0.0;
    }

    public Double calculatePensionTax() {
        return 0.0;
    } // 7,5%

    public Double calculateInsuranceTax() {
        return 0.0;
    } // 0.1%.

    public Double calculateSalaryAfterAllTaxes() {
        return 0.0;
    }

    /**
     * get / set
     */
}
