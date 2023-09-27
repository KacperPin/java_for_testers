package lessons;

import Zadania.Bug;
import Zadania.BugReporter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class exceptions {
    public static void main(String[] args) throws IOException {
//
//        WYJATKI - SYTUACJE WYJATKOWE
//
//        1. DWA TYPY WYJATKOW - MUSIMY LAPAC I NIE MUSIMY LAPAC
//        2. LAPANIE WYJATKOW
//        3. RZUCANIE WYJATKOW
//        4. DODANIE WYJATKOW DO SYGNATURY METODY
//        5. TWORZENIE WLASNYCH WYJATKOW
//
//        1. MUSIMY LAPAC - Exception
//                FileNotFoundException();
//                IOException();
//
//        2. NIE Musimy LAPAC - RunTimeException
//                IllegalStateException(); -> niczego nie znaleziono
//        IllegalArgumentException(); -> niedozwolony argument, który chcemy przekazać
//        NullPointerException();
//        IndexOutOfBoundsException();
//        UnsupportedOperationException(); ->
//

//        try {
//            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
//
//            String line = br.readLine();
//
//            while(line !=null){
//                System.out.println(line);
//                line = br.readLine();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("TO WYKONA SIĘ ZAWSZE NIEZALEŻNIE OD WYJĄTKU");
//        }

//        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
//            String line = br.readLine();
//
//            while(line !=null){
//                System.out.println(line);
//                line = br.readLine();
//            }

//        NullPointerException -----------------

//        Bug bug = new Bug("Opis", 5, new BugReporter("Kazimierz", "Kaźmierczuk", "kk@kk.com"), 1);
//
//        bug = null;
//        System.out.println(bug.getBugDescription());

//        IndexOutOfBoundsException -------------

//            List<String> names = new ArrayList<>();
//            names.add("Zbigniew"); //0
//
//        System.out.println(names.get(1));

    }
}
