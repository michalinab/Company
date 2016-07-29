package it.morfoza.company;

public class Employee {

    private String name;
    private String lastname;
    private double salary;
    private String position;
    private boolean hardworking;

    public Employee(String name, String lastname, double salary, String position, boolean hardworking){
        this.name=name;
        this.lastname=lastname;
        this.salary=salary;
        this.position=position;
        this.hardworking=hardworking;
    }



    public double getSalary () {
        return salary;
    }

    public void giveRise (int percent){
        salary+=salary * percent / 100;
    }

    public String toString(){
        return  "Name: " + name + " Lastname: " + lastname + "\n" + " Salary: " + salary + " Position: " + position + "\n" + " Hardworking: " + hardworking +"\n" ;
    }

}
