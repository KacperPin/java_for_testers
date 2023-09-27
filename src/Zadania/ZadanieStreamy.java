package Zadania;
import computer.Computer;
import computer.Laptop;
import computer.PC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class ZadanieStreamy {
    public static void main(String[] args) {
//        1. Zliczyć wszystkie komputery, które mają więcej niż 128GB ramu
//        2. Wyświetlić na konsolę wszystkie typy komputerów - map
//        3. Wyświetlić komputer, który ma najwięcej ramu
//        4. Posortować komputery po nazwie i typie
//        5. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 gb
//        6. Przećwiczyć optional:
//            - get()
//            - isPresent()
//            - isEmpty()
//            - orElse()
//            - orElseGet()
//            - orElseThrow()
//            - ifPresent()
//            - ifPresentOrElse()

        List<Computer> computers = new ArrayList<>();
        computers.add(new PC("PC 1", "Proffesional", 64, 64, false));
        computers.add(new PC("PC 2", "Enterprise", 256, 128, false));
        computers.add(new PC("PC 3", "Standard", 512, 16, false));
        computers.add(new Laptop("Laptop 3", "Enterprise", 256, 8, 98));
        computers.add(new Laptop("Laptop 2", "Standard", 512, 16, 58));
        computers.add(new Laptop("Laptop 1", "Proffesional", 1024, 64, 100));

        System.out.println("1. Zliczyć wszystkie komputery, które mają więcej niż 128GB ramu");

        long count = computers.stream()
                .map(Computer::getRam)
                .filter(computer -> computer > 128)
                .count();

        System.out.println(count);

        System.out.println("2. Wyświetlić na konsolę wszystkie typy komputerów - map");

        computers.stream()
                .map(Computer::getType)
                .forEach(type -> System.out.println(type));

        System.out.println("3. Wyświetlić komputer, który ma najwięcej ramu");

        Computer compMaxRam = computers.stream()
                        .max(Comparator.comparingInt(comp -> comp.getRam()))
                                .orElseThrow(() -> new IllegalStateException("Nie znaleziono żadnego komputera"));
        System.out.println(compMaxRam.getName());

        System.out.println("4. Posortować komputery po nazwie i typie");

        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer computer : sortedComputers) {
            System.out.println(computer.getName() + " " + computer.getType() + " " + computer.getHdd() + " " + computer.getRam());
        }

        System.out.println("5. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 gb");

        List<Computer> collect = computers.stream()
                .filter(comp -> comp.getHdd() < 500)
                .collect(Collectors.toList());

        for (Computer comp : collect){
            System.out.println(comp.getName() + " " + comp.getHdd());
        }

        System.out.println("6. Przećwiczyć optional:");
        System.out.println("- get()");

        Optional<String> name = computers.stream()
                        .map(Computer::getName)
                                .findFirst();

        System.out.println(name.get());

        System.out.println("- isPresent()");

        if(name.isPresent()) {
            System.out.println("Znaleziono pierwszy komputer o nazwie: " + name.get());
        }else{
            System.out.println("Nie znaleziono żadnego komputera, który ma nazwę");
        }

        System.out.println("- isEmpty()");

        if(name.isEmpty()) {
            System.out.println("Nie znaleziono żadnego komputera!");
        }else{
            System.out.println("Znaleziono komputer, choć tak nie powinno być!");
        }

        System.out.println("- orElse()");

        String isType = computers.stream()
                .map(Computer::getType)
                .filter(comp -> comp.startsWith("PC"))
                .findFirst()
                .orElse("Nie znaleziono takiego komputera!");
        System.out.println(isType);

        System.out.println("- orElseGet()");

        Computer isName = computers.stream()
                .filter(comp -> comp.getType().startsWith("PC"))
                .findFirst()
                .orElseGet(() -> new PC("PC 4", "PC", 10480, 1024, false));

        System.out.println(isName);

        System.out.println("- orElseThrow()");



        System.out.println("- ifPresent()");



        System.out.println("- ifPresentOrElse()");



    }
}
