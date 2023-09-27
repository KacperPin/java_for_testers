package lessons;

import utils.WeekDays;

public class enums {
    public static void main(String[] args) {
        //ENUM - TYPY WYLICZENIOWE

        System.out.println(WeekDays.PONIEDZIALEK);

        if("środa".equalsIgnoreCase(WeekDays.SRODA.getName())){
            System.out.println("Wszystko się zgadza");
        }else{
            System.out.println("Coś jest nie tak");
        }

    }
}
