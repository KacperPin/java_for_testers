package lessons;

public class demo {
    public static void main(String[] args) {

//        User kacper = new User("Kacper", "Tester", "kacper.pindelski@cloudimed.pl", 26);
//        kacper.greetings(kacper.firstName);
//        kacper.getFullInfo();

        Bug testBug = new Bug("Nie działa aplikacja", "kacper.pindelski@cloudimed.pl",5);
        testBug.bugStatus = false;
        testBug.bugAllInformation();
        testBug.personReportBug();
        testBug.getBugStatus();
        int bugPriority = testBug.getBugPriority();
        System.out.println("Priorytet błędu to: " + bugPriority);
    }
}
