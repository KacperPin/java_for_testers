package Zadania;

public class Zadanie1 {
    public static void main(String[] args) {

        // 1. 4 zmienne typu int
        // 2. Sprawdzamy czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdzamy czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste

// 1. 4 zmienne typu int
        int numOne = 4;
        int numTwo = 3;
        int numThree = 6;
        int numFour = 3;
// 2. Sprawdzamy czy suma dwóch pierwszych jest parzysta
        if ((numOne + numTwo) % 2 == 0) {
            System.out.println("Suma liczb " + numOne + " oraz " + numTwo + " jest parzysta");
        } else {
            System.out.println("Suma liczb " + numOne + " oraz " + numTwo + " jest nieparzysta");
        }
// 3. Sprawdzamy czy suma dwóch pozostałych jest parzysta
        if ((numThree + numFour) % 2 == 0) {
            System.out.println("Suma liczb " + numThree + " oraz " + numFour + " jest parzysta");
        } else {
            System.out.println("Suma liczb " + numThree + " oraz " + numFour + " jest nieparzysta");
        }
// 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste

        if (((numOne + numTwo) % 2 == 0) && ((numThree + numFour) % 2 == 0)) {
            System.out.println("Wszystkie sumy są parzyste");
        } else {
            System.out.println("Nie wszystkie liczby są parzyste");
        }
    }
}
