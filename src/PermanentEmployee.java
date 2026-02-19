public class PermanentEmployee extends Employee { // Doimiy xodim
    private String room;

    public PermanentEmployee() {
    }

    public PermanentEmployee(String name, String surname, Double salary, String work, String room) {
        super(name, surname, salary, work);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    /*@Override
    public String toString() {
        return "PermanentEmployee{" +
                super.toString()+
                "room='" + room + '\'' +
                '}';
    }*/

    @Override
    public String getDetail() {
        return super.getDetail() + ", " + room;
    }

    @Override
    public String getEmployeeType() {
        return "Permanent";
    }

    @Override
    public Double getOneTimeBonus() {
        return super.getSalary() * 0.5;
    }

    @Override
    public Double calculatePensionTax() {
        return super.getSalary() * 7.5 / 100;
    }

    @Override
    public Double calculateInsuranceTax() {
        return super.getSalary() * 0.01;
    }
}
