public class SeasonalEmployees extends Employee { // Mavsumiy xodimlar
    private String season;

    public SeasonalEmployees() {
    }

    public SeasonalEmployees(String name, String surname, Double salary, String work, String season) {
        super(name, surname, salary, work);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    /*@Override
    public String toString() {
        return "SeasonalEmployees{" +
                super.toString() +
                "season='" + season + '\'' +
                '}';
    }*/

    @Override
    public String getDetail() {
        return super.getDetail() + ", " + season;
    }

    @Override
    public String getEmployeeType() {
        return "Seasonal";
    }

    @Override
    public Double getOneTimeBonus() {
        return super.getSalary() * 0.2;
    }

    @Override
    public Double calculatePensionTax() {
        return super.getSalary() * 6.5 / 100;
    }

    @Override
    public Double calculateInsuranceTax() {
        return super.getSalary() * 0.005;
    }
}
