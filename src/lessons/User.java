package lessons;

public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
    void getAllData(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

}
