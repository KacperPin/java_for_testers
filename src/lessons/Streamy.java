package lessons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streamy {

    public static void main(String[] args) {

        // STREAMY - STRUMIENIE WARTOSCI

        // ["Bartek", "Antek", "Tomek", "Filip", "Romek", "Franek", "Artur", "Feliks"] -> stream
        // wyszukaj imiona zaczynające się na F -> stream ["Filip", "Franek", "Feliks"]
        // wyszukaj imiona, które zawierają literę k -> stream ["Franek", "Feliks"]
        // wyszukaj imiona, które kończą się na literę s -> stream ["Feliks"]

        // METODY POSREDNIE - ZWRACAJĄ NOWE STREAMY
        // filter - filtrowanie elementów
        // map - przekształcanie elementów

        //METODY TERMINALNE - SĄ WYKONYWANE JAKO OSTATNIE - ZWRACAJĄ WARTOSC, POZWALAJĄ ZEBRAC WARTOSCI DO KOLEKCJI
        //forEach - wyswietlanie elementów
        // min | max | sum
        // anyMatch | allMatch | nonMatch
        //count
        // collect - zbieranie elementów

//        List<String> names = new ArrayList<>();
//        names.add("Bartek");
//        names.add("Antek");
//        names.add("Tomek");
//        names.add("Filip");
//        names.add("Romek");
//        names.add("Franek");
//        names.add("Artur");
//        names.add("Feliks");
//
//        names.stream()
//                .filter(str -> str.startsWith("F"))
//                .filter(str -> str.contains("k"))
//                .filter(str -> str.endsWith("s"))
//                .forEach(str -> System.out.println(str));
//
//        names.stream()
//                .filter(str -> str.length() <= 5)
//                .map(str -> "Krótkie imię: " + str)
//                .forEach(str -> System.out.println(str));
//
//        long count = names.stream()
//                .filter(str -> str.length() <= 5)
//                .count();
//
//        System.out.println(count);
//
//        List<String> fnames = names.stream()
//                .filter(str -> str.startsWith("F"))
//                .collect(Collectors.toList());
//
//        System.out.println(fnames);
//
//        boolean anyMatch = names.stream()
//                .anyMatch(str -> str.startsWith("F"));
//        System.out.println(anyMatch);
//
//        boolean allMatch = names.stream()
//                .allMatch(str -> str.length() < 5);
//        System.out.println(allMatch);
//
//        boolean noneMatch = names.stream()
//                .noneMatch(str -> str.contains("a"));
//        System.out.println(noneMatch);


        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Zwierzak", "bzwierz@gmail.com", 23));
        users.add(new User("Antek", "Arnold", "aarni@gmail.com", 26));
        users.add(new User("Tomek", "Lipa", "tlipski@gmail.com", 24));
        users.add(new User("Filip", "Krętacz", "fkret@gmail.com", 13));
        users.add(new User("Filip", "Lipski", "flipski@gmail.com", 13));
        users.add(new User("Filip", "Krętacz", "fkret@gmail.com", 137));
        users.add(new User("Romek", "Podarek", "rpodarek@gmail.com", 33));
        users.add(new User("Franek", "Kruk", "fkruk@gmail.com", 12));
        users.add(new User("Artur", "Bartysiak", "abartys@gmail.com", 23));
        users.add(new User("Feliks", "Kicz", "fkicz@gmail.com", 25));
        users.add(new User("Kasia", "Kicz", "fkicz@gmail.com", 25));

//        List<User> sortedUsers = users.stream()
//                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::userAge))
//                .collect(Collectors.toList());
//
//        for (User user : sortedUsers) {
//            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.userAge());
//        }


        //Optional - opakowanie dla obiektu
        //Optional[ obiekt ] / Optional[]
        //Zabezpieczenie przed null'ami

//        Optional<User> max = users.stream()
//                .max(Comparator.comparingInt(User::userAge));

        //get()
        //isPresent()
        //isEmpty()
        //orElse()
        //orElseGet()
        //orElseThrow()
        //ifPresent()
        //ifPresentOrElse()

//        System.out.println(max.get()); // Niebezbieczne bo nie jest zabezpieczone przed null'ami np. kiedy lista jest pusta

//        if(max.isPresent()){
//            System.out.println(max.get());
//        }else{
//            System.out.println("Nie znaleziono takiego elementu");
//        }

        Integer maxAge = users.stream()
                .map(User::userAge)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(maxAge);

        String isUser = users.stream()
                .map(User::getFirstName)
                .filter(str -> str.equals("Kasia"))
                .findFirst()
                .orElse("Nie znaleziono takiego użytkownika");

        System.out.println(isUser);
    }
}
