package Zadania;

public class BugZadanie {
    public static void main(String[] args) {

        BugReporter reporter = new BugReporter("Kacper", "Tester", "adresbezmalpy.pl");
        Bug firstBug = new Bug("Jakiś opis błędu", 5, reporter);

        System.out.println(firstBug);

        firstBug.setBugStatus(true);

        System.out.println(reporter.getEmailAdres());
        reporter.setEmailAdres("email@email.com");
        System.out.println(reporter.getEmailAdres());
        System.out.println(firstBug);
    }
}
