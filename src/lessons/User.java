package lessons;
import exceptions.IncorrectEmailFormatException;

public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;
    String gender;
    User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    User(String firstName, String lastName, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public User(String firstName, String lastName, String email, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    public void setEmail(String email) throws IncorrectEmailFormatException {
        if(!email.contains("@")){
            throw new IncorrectEmailFormatException("Adres email musi zawierać znak małpy!");
        }else{
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }
}
