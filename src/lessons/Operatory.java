package lessons;

public class Operatory {
    public static void main(String[] args) {

        // operatory matematyczne

//        System.out.println(10 + 10);
//        System.out.println(10 - 10);
//        System.out.println(10 * 10);
//        System.out.println(10 / 10);
//        System.out.println(10.0 / 4.0);
//

        // operatory porównania

        int numOne = 2;
        int numTwo = 1;

//        System.out.println(numOne > numTwo);
//        System.out.println(numOne < numTwo);
//        System.out.println(numOne == numTwo);
//        System.out.println(numOne != numTwo);
//
//
//        // operatory logiczne
//
//        System.out.println(numOne > numTwo || numOne == 1); // false || true -> true
//        System.out.println(numOne > numTwo || numOne != 1); // false || false -> false
//        System.out.println(numOne < numTwo || numOne != 1); // true || nie jest sprawdzane -> true
//
//        System.out.println(numOne < numTwo && numOne == 1); // TRUE && TRUE -> True
//        System.out.println(numOne > numTwo && numOne == 1); // FALSE && TRUE -> False
//        System.out.println(numOne > numTwo && numOne != 1); // FALSE && FALSE -> False
//
//
//        if(numOne < numTwo){
//            System.out.println("Number one is less than number two");
//        }else {
//            System.out.println("Number one is greater than number two");
//        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Test";

        switch (page) {
            case "Home":
                System.out.println("Idź do Home");
                break;
            case "Login":
                System.out.println("Idź do Login");
                break;
            case "Contact":
                System.out.println("Idź do Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }


    }
}
