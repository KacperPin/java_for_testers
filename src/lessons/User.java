package lessons;

public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    User(){

    }

    User(String firstName, String lastName, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
    void getFullInfo(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int userAge(){
        return age;
    }
    boolean isUserAdult(){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }

    void greetings(String userName){
        System.out.println("Hello, " + userName + " nice to see you!");
    }

    void greetings(String firstName, String lastName){
        System.out.println("Hello, " + firstName + " "+ lastName + " nice to see you!");
    }

    int userAgePlus10(int userAge){
        return userAge + 10;
    }



}
