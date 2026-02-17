public class CompanyManagement {
    //permanent employee
    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentEmployeeIndex = 0;

    //seasonal employee
    private SeasonalEmployees[] seasonalEmployeeArray = new SeasonalEmployees[10];
    private int seasonalEmployeeIndex = 0;

    //temporary employee
    private TemporaryEmployee[] temporaryEmployeeArray = new TemporaryEmployee[10];
    private int temporaryEmployeeIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(name, surname, salary, work, room);
     /*   permanentEmployee.setName(name);
        permanentEmployee.setSurname(surname);
        permanentEmployee.setSalary(salary);
        permanentEmployee.setWork(work);
        permanentEmployee.setRoom(room);*/

        permanentEmployeeArray[permanentEmployeeIndex++] = permanentEmployee;
        return permanentEmployee;
    }

    public SeasonalEmployees addSeasonalEmployee(String name, String surname, Double salary, String work, String season) {
        SeasonalEmployees seasonalEmployee = new SeasonalEmployees(name, surname, salary, work, season);
        /*seasonalEmployee.setName(name);
        seasonalEmployee.setSurname(surname);
        seasonalEmployee.setSalary(salary);
        seasonalEmployee.setWork(work);
        seasonalEmployee.setSeason(season);
*/
        seasonalEmployeeArray[seasonalEmployeeIndex++] = seasonalEmployee;
        return seasonalEmployee;
    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(name, surname, salary, work, workingHours);
        /* temporaryEmployee.setName(name);
        temporaryEmployee.setSurname(surname);
        temporaryEmployee.setSalary(salary);
        temporaryEmployee.setWork(work);
        temporaryEmployee.setWorkingHours(workingHours);*/

        temporaryEmployeeArray[temporaryEmployeeIndex++] = temporaryEmployee;
        return temporaryEmployee;
    }

    public void printAllEmployeeDetail() {
        for (PermanentEmployee employee : permanentEmployeeArray){
            if (employee != null){
                System.out.println(employee.getDetail());
            }
        }

        for (SeasonalEmployees employee : seasonalEmployeeArray){
            if (employee != null){
                System.out.println(employee.getDetail());
            }
        }

        for (TemporaryEmployee employee : temporaryEmployeeArray){
            if (employee != null){
                System.out.println(employee.getDetail());
            }
        }
    }

    public void printAllEmployeeType() {


    }

    public void showAllEmployeeBonus() {

    }

    public void showAllPensionTax() {

    }

    public void showAllInsuranceTax() {

    }

    public void showAllSalaryAfterAllTaxes() {

    }
}
