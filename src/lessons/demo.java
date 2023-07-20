package lessons;

public class demo {
    public static void main(String[] args) {

        User kacper = new User();
        kacper.firstName = "Kacper";
        kacper.lastName = "Tester";
        kacper.email = "kacper.pindelski@cloudimed.pl";
        kacper.age = 26;
        kacper.isAdult = true;
        kacper.getFullName();
        kacper.getAllData();
    }
}
