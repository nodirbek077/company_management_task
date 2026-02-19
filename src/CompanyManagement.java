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

    //employee
    private Employee[] employeeArray = new Employee[10];
    private int employeeIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(name, surname, salary, work, room);
     /*   permanentEmployee.setName(name);
        permanentEmployee.setSurname(surname);
        permanentEmployee.setSalary(salary);
        permanentEmployee.setWork(work);
        permanentEmployee.setRoom(room);*/

//        permanentEmployeeArray[permanentEmployeeIndex++] = permanentEmployee;
        employeeArray[employeeIndex++] = permanentEmployee;
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
//        seasonalEmployeeArray[seasonalEmployeeIndex++] = seasonalEmployee;
        employeeArray[employeeIndex++] = seasonalEmployee;
        return seasonalEmployee;
    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(name, surname, salary, work, workingHours);
        /* temporaryEmployee.setName(name);
        temporaryEmployee.setSurname(surname);
        temporaryEmployee.setSalary(salary);
        temporaryEmployee.setWork(work);
        temporaryEmployee.setWorkingHours(workingHours);*/

//        temporaryEmployeeArray[temporaryEmployeeIndex++] = temporaryEmployee;
        employeeArray[employeeIndex++] = temporaryEmployee;
        return temporaryEmployee;
    }

    public PartnerEmployee addPartnerEmployee(String name, String surname, Double salary, String work, String companyName) {
        PartnerEmployee partnerEmployee = new PartnerEmployee(name, surname, salary, work, companyName);
        /* temporaryEmployee.setName(name);
        temporaryEmployee.setSurname(surname);
        temporaryEmployee.setSalary(salary);
        temporaryEmployee.setWork(work);
        temporaryEmployee.setWorkingHours(workingHours);*/

//      temporaryEmployeeArray[temporaryEmployeeIndex++] = temporaryEmployee;
        employeeArray[employeeIndex++] = partnerEmployee;
        return partnerEmployee;
    }

    public EarEmployee addEarEmployee(String name, String surname, Double salary, String work) {
        EarEmployee earEmployee = new EarEmployee(name, surname, salary, work);
        employeeArray[employeeIndex++] = earEmployee;
        return earEmployee;
    }

    public void printAllEmployeeDetail() {
        /*PermanentEmployee permanentEmployee = new PermanentEmployee();
        SeasonalEmployees seasonalEmployees = new SeasonalEmployees();
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee();

        Employee permEmployee = new PermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        Employee seasonEmployee = new SeasonalEmployees("Axmad", "Axmadov", 400d, "Work1", "Autumn");
        Employee tempEmployee = new TemporaryEmployee("Eshmad", "Eshmatov", 100d, "Work1", 5);

        Employee fatherEmployee = new Employee("Mazgi", "Mazgiyev",9000d,"office");

        System.out.println(permEmployee.getDetail());
        System.out.println(seasonEmployee.getDetail());
        System.out.println(tempEmployee.getDetail());
        System.out.println(fatherEmployee.getDetail());*/

        //hammasini bitta employeeArray deb nomlangan arrayga joylashtirdik shuning uchun bular kerak emas
        /*for (PermanentEmployee employee : permanentEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

        for (SeasonalEmployees employee : seasonalEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

        for (TemporaryEmployee employee : temporaryEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }*/

        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }
    }

    public void printAllEmployeeType() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getEmployeeType());
            }
        }
    }

    public void showAllEmployeeBonus() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getOneTimeBonus());
            }
        }
    }

    public void showAllPensionTax() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.calculatePensionTax());
            }
        }
    }

    public void showAllInsuranceTax() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.calculateInsuranceTax());
            }
        }
    }

    public void showAllSalaryAfterAllTaxes() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.calculateSalaryAfterAllTaxes());
            }
        }
    }
}
