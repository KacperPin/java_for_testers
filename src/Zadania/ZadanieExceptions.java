package Zadania;

import lessons.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZadanieExceptions {
    public static void main(String[] args) {

        // ENUM
        // 1. Utworzyć nowy enum - gender - M,K -> done
        // 2. W klasie User dodać nowe pole enum Gender + gettery i settery -> done
        // 3. Utworzyć nowy konstruktor, który jako kolejny parametr przyjmie enuma -> done
        // 4. Utworzyć listę kilku użytkowników -> done
        // 5. W streamie wyszukać tylko kobiety -> done

        // Wyjątki
        // 1. Utworzyć nowy plik txt z imionami - ręcznie lub za pomocą BufferedWriter -> done
        // 2. Wczytać imiona z txt do listy -> done
        // 3. W streamie sprawdzić czy lista zawiera jakieś imię, jeżeli nie to rzucić wyjątkiem -> done
        // 4. Utworzyć własny wyjątek IllegalBugPriorityException i rzucić go z klasy Bug do metody setBugPriority

        List<User> users = new ArrayList<>();
        users.add(new User("Grzegorz", "Królik", "gkrolik@gmail.com", 23, "MALE"));
        users.add(new User("Michał", "Starygard", "mstarygard@gmail.com", 24, "MALE"));
        users.add(new User("Anna", "Popiół", "mpopiol@gmail.com", 25, "FEMALE"));
        users.add(new User("Liza", "Barakuda", "lbarakuda@gmail.com", 22, "FEMALE"));
        users.add(new User("Witold", "Baran", "wbaran@gmail.com", 47, "MALE"));

       List<User> woman =  users.stream()
                .filter(gen -> gen.getGender().equalsIgnoreCase("FEMALE"))
                .collect(Collectors.toList());

        for (User u : woman) {
            System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.getEmail());
        }
        List<String> importNames = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("names.txt"));

            String line = br.readLine();


            while(line !=null){
                importNames.add(line);
                line = br.readLine();
            }
            for (String str : importNames) {
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("TO WYKONA SIĘ ZAWSZE NIEZALEŻNIE OD WYJĄTKU");
        }

        importNames.stream()
                .filter(str -> str.equals("Bogdan"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Nie znaleziono takiego użytkownika"));
    }
}
