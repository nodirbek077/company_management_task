public class Main {

    public static void main(String[] args) {
        CompanyManagement companyManager = new CompanyManagement();

        companyManager.addPermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        companyManager.addPermanentEmployee("Vali", "Valiyev", 700d, "Choychi", "1d");

        companyManager.addSeasonalEmployee("Axmad", "Axmadov", 400d, "Work1", "Autumn");
        companyManager.addSeasonalEmployee("Toshmad", "Toshmatov", 500d, "Work1", "Autumn");

        companyManager.addTemporaryEmployee("Eshmad", "Eshmatov", 100d, "Work1", 5);

        companyManager.addPartnerEmployee("Chang", "Changov", 200d, "Work2", "asia");
        companyManager.addEarEmployee("Quloq", "Quloqov", 100d, "Work4");

//        companyManager.printAllEmployeeDetail();

        companyManager.printAllEmployeeType();
//        companyManager.showAllEmployeeBonus();
//        companyManager.showAllPensionTax();
//        companyManager.showAllInsuranceTax();
//        companyManager.showAllSalaryAfterAllTaxes();
    }
}
