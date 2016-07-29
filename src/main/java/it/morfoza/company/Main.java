package it.morfoza.company;

public class Main {
    public static void main(String[] args) {
       Company lodz360 = new Company();

        System.out.println(lodz360.toString());

        System.out.println(lodz360.calculateTotalSalaries());


        lodz360.giveRise(20);

        System.out.println(lodz360.toString());


        System.out.println(lodz360.calculateTotalSalaries());


    }

}
