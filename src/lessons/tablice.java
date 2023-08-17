package lessons;

public class tablice {
    public static void main(String[] args) {

//        //  ------SORTOWANIE MALEJĄCE---------
//        int[] numbers = {5, 2, 7, 3, 8, 9, 1, 0, 3, 2, 4};
//
//        int max;
//
//        for (int i = 0; i < numbers.length; i++) {
//            max = numbers[i];
//            for(int j = i +1; j < numbers.length; j++) {
//                if(numbers[j] > max) {
//                    max = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = max;
//                }
//            }
//        }
//        for(int numbero: numbers){
//            System.out.println(numbero);
//        }
//
//  ------SORTOWANIE ROSNĄCE---------
//        int[] numbers = {5, 2, 7, 3, 8, 9, 1, 0, 3, 2, 4};
//
//        int min;
//
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[i];
//            for(int j = i +1; j < numbers.length; j++) {
//                if(numbers[j] < min) {
//                    min = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = min;
//                }
//            }
//        }
//        for(int numbero: numbers){
//            System.out.println(numbero);
//        }
//
// -------PARZYSTE I NIEPARZYSTE ---------
//        int[] numbers = {2, 2, 3, 4, 4, 5, 7, 8, 8, 8, 9};
//        int parzysta = 0;
//        int nieparzysta = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                parzysta++;
//            } else {
//                nieparzysta++;
//            }
//        }
//
//        System.out.println("Ilość liczb parzystych: " + parzysta + " nieparzystych: " + nieparzysta);
//-------- Zamiana pierwszej z ostatnią --------------------------------
//        int[] number = {1, 2, 3, 4, 5};
//        System.out.println("Pierwsza liczba przed zmianą: " + number[0]);
//        System.out.println("ostatnia liczba przed zmianą: " + number[number.length - 1]);
//        int first = number[0];
//        int last = number[number.length - 1];
//        number[number.length - 1] = first;
//        number[0] = last;
//        System.out.println("Pierwsza liczba po zmianie : " + number[0]);
//        System.out.println("ostatnia liczba po zmianie: " + number[number.length - 1]);

//        int temp = number[0];
//        number[0] = number[number.length - 1];
//        number[number.length - 1] = temp;
//
//        for(int numbers: number){
//            System.out.println(numbers);
//        }

//        System.out.println("------------ PIERWSZE WYśWIETLENIE");
//        for(int numbers: number){
//            System.out.println(numbers);
//        }
//
//        for( int i = 0; i < number.length - 1; i++){
//            number[0]++;
//        }
//        for( int i = number.length - 1; i > 0; i--){
//            number[number.length - 1]--;
//        }
//        System.out.println("------------ DRUGIE WYśWIETLENIE");
//        for(int numbers: number){
//            System.out.println(numbers);
//        }

//        System.out.println("------------ PIERWSZE WYśWIETLENIE");
//        for (int numbers : number) {
//            System.out.println(numbers);
//        }
//        number[number.length - 1] = number[number.length - 1] + number[0];
//        number[0] = number[number.length - 1] - number[0];
//        number[number.length - 1] = number[number.length - 1] - number[0];
//
//        System.out.println("------------ DRUGIE WYśWIETLENIE");
//        for (int numbers : number) {
//            System.out.println(numbers);
//        }
    }


}
