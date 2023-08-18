package Zadania;

import computer.Computer;
import computer.Laptop;
import computer.PC;

public class ZadanieAbstract {
    public static void main(String[] args) {
        Computer officeComputer = new PC("Office computer", "Asus", 1024, 32, true);
        Computer privateLaptop = new Laptop("Private Laptop", "Asus ROG", 3072, 64, 50);


        officeComputer.setVolume(10);
        int actualPcVolume = officeComputer.getVolume();
        actualPcVolume =  officeComputer.volumeUp(100);
        System.out.println(actualPcVolume);
        actualPcVolume = officeComputer.volumeDown(33);
        System.out.println(actualPcVolume);

        privateLaptop.setVolume(10);
        int actualLaptopVolume = privateLaptop.getVolume();
        actualLaptopVolume = privateLaptop.volumeUp(23);
        System.out.println(actualLaptopVolume);
        actualLaptopVolume = privateLaptop.volumeDown(34);
        System.out.println(actualLaptopVolume);


    }
}
