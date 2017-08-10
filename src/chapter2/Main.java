package chapter2;

// Chapter 2 - OOP

import org.omg.CORBA.IntHolder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// task 10 - randomElement
// static method can`t have object

//        int[] arrWin = new int[6];
//
//        for (int i = 0; i < arrWin.length; i++) {
//            int randomIndex = (int) (Math.random() * arr.length);
//            arrWin[i] = arr[randomIndex];
//        }
//        System.out.println(Arrays.toString(arrWin));
//
//        ArrayList<Integer> arrListWin = new ArrayList<>();
//
//        for (int i = 0; i < arrWin.length; i++) {
//            arrListWin.add(arrWin[i]);
//        }

// task 9 - class Car todo

// task 5-8 - see class Point

// task 4 - IntHolder todo

// task 3 - setter != void, getter = void todo

// task 2 - accessor = getter (returns a class's variable or its value)
//          mutator = setter (sets a class's variable or its value)
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = in.nextInt(); // accessor
//        System.out.println(number);
//
//        Random r = new Random(); // better to use than Math
//        System.out.println(r.nextInt(number)); // accessor

// task 1 - calendar with the begin on Sunday
//        LocalDate date = LocalDate.now();
//
//        int month = date.getMonthValue();
//        int today = date.getDayOfMonth();
//
//        System.out.println("month = " + month);
//        System.out.println("today = " + today);
//
//        date = date.minusDays(today - 1);
//        DayOfWeek weekday = date.getDayOfWeek();
//        int value = weekday.getValue();
//
//        System.out.println(date.getMonthValue());
//        System.out.println("weekday = " + weekday);
//        System.out.println("value = " + value);
//
//
//        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
//        for (int i = 1; i < value + 1; i++) {
//            System.out.print("    ");
//        }
//
//        while (date.getMonthValue() == month) {
//            System.out.printf("%3d", date.getDayOfMonth());
//            if (date.getDayOfMonth() == today) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//            date = date.plusDays(1);
//
//            if (date.getDayOfWeek().getValue() == 7) {
//                System.out.println();
//            }
//        }

    }
}
