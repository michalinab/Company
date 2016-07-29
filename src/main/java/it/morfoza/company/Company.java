package it.morfoza.company;
public class Company {
    private Employee ceo;
    private Employee cfo;
    private Employee cleaner;

    public Company () {
        Employee John = new Employee("John", "Kowalski", 1000, "ceo",true );
        Employee Ben = new Employee("Ben", "Nowak", 2000, "cfo", false);
        Employee Zdzisław = new Employee("Zdzisław","Krakus", 3000, "cleaner", true);

        ceo = John;
        cfo = Ben;
        cleaner = Zdzisław;
    }

    public double calculateTotalSalaries() {
        return ceo.getSalary() + cfo.getSalary() + cleaner.getSalary();
    }

    public void giveRise(int percent) {
        ceo.giveRise(percent);
        cfo.giveRise(percent);
        cleaner.giveRise(percent);
    }

    public String toString() {
        return "Company:" + "\n" + "[ceo: "+ ceo + "cfo: " + cfo + "cleaner: " + cleaner + "]";
    }
}
