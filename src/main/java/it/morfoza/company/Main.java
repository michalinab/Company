package it.morfoza.company;

public class Main {
    public static void main(String[] args) {
       Company lodz360 = new Company();

        System.out.println("Dane pracowników przed podwyżką:" + "\n" + lodz360.toString());

        System.out.println("Suma płac pracowników: " + lodz360.calculateTotalSalaries());


        lodz360.giveRise(20);

        System.out.println("Dane pracowników po podwyżce" + "\n" + lodz360.toString());


        System.out.println("Suma płac pracowników: " + lodz360.calculateTotalSalaries());


    }

}
