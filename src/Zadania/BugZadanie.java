package Zadania;

import java.util.*;

public class BugZadanie {
    public static void main(String[] args) {

        BugReporter reporter = new BugReporter("Kacper", "Tester", "adresbezmalpy.pl");
        Bug firstBug = new Bug("Nie działa aplikacja", 5, reporter);
        Bug secondBug = new Bug("Nie można się zalogować do aplikacji", 5, reporter);
        Bug thirdBug = new Bug("Kalkulator niepoprawnie interpretuje znak PLUS", 5, reporter);
        Bug doubleBug = new Bug("Kalkulator niepoprawnie interpretuje znak PLUS", 5, reporter);

//        System.out.println(firstBug);
//        firstBug.setBugStatus(true);
//        System.out.println(reporter.getEmailAdres());
//        reporter.setEmailAdres("email@email.com");
//        System.out.println(reporter.getEmailAdres());
//        System.out.println(firstBug);


//        Map<Integer, Bug> Bugs = new HashMap<Integer, Bug>();
//
//        Bugs.put(1, firstBug);
//        Bugs.put(2, secondBug);
//        Bugs.put(3, thirdBug);
//        Bugs.put(4, doubleBug);


//        Map<Integer, Bug> SortedBugs = new TreeMap<>(Bugs);
//        System.out.println(Collections.sort(SortedBugs, Comparator.comparing(Bug::getBugDescription)));

//        for (HashMap.Entry<Integer, Bug> entry : Bugs.entrySet())
//             ) {
//
//        }

        List<Bug> bugsList = new ArrayList<>();
        bugsList.add(new Bug("Nie działa aplikacja", 5, reporter));
        bugsList.add(new Bug("Nie można się zalogować do aplikacji", 5, reporter));
        bugsList.add(new Bug("Kalkulator niepoprawnie interpretuje znak PLUS", 5, reporter));
        bugsList.add(new Bug("Kalkulator niepoprawnie interpretuje znak PLUS", 5, reporter));


       Map <Integer, Bug> bugMap = new TreeMap<>();

        Collections.sort(bugsList, Comparator.comparing(Bug::getBugDescription));

        System.out.println("------------------------ POSORTOWANA LISTA");
        for (Bug bug : bugsList) {
            System.out.println(bug.getBugDescription());
        }

        Set<Bug> bugsSet = new HashSet<>(bugsList);

        System.out.println("------------------------ UNIKALNA LISTA");
        for (Bug bug : bugsSet) {
            System.out.println(bug.getBugDescription());
        }

        Set<Bug> sortedBugSet = new TreeSet<>(bugsSet);

        System.out.println("------------------------ POSORTOWANA ORAZ UNIKALNA LISTA");
        for (Bug bug : sortedBugSet) {
            System.out.println(bug.getBugDescription());
        }
    }
}
