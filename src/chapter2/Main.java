package chapter2;

// Chapter 2 - OOP

import org.omg.CORBA.IntHolder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

// task 16 - inner class todo

//// task 15 - static nested class
//        Invoice newInvoice = new Invoice();
//        newInvoice.addItem("book", 1, 20.15);
//        newInvoice.addItem("magazine", 2, 14.60);
//        String s = newInvoice.itemsOut();
//        System.out.println(s); //todo

//        String s = String.join(", ", newInvoice.itemsOut());
//        System.out.println(s);


//        String listString = String.join(", ", newInvoice.itemsOut());
//        String listString = newInvoice.getItems().stream().map(Object::toString)
//                .collect(Collectors.joining(", "));
//        System.out.println(listString);


// task 14 - Inner class - Network$Member.class

// task 13 - Add jar - Project Structure->Modules->Dependencies->Add todo
// import com.opencsv.*;

// task 12 - Java file in wrong (different package) folder
// > javap HelloWorld
// > Warning: Binary file HelloWorld contains chapter2.HelloWorld
//   Compiled from "HelloWorld.java"
//   public class chapter2.HelloWorld {
//       public chapter2.HelloWorld();
//       public static void main(java.lang.String[]);
//   }
// after use javac -d . HelloWorld.java
// new folder "chapter2" create with HelloWorld.class

// task 11 - Static import
// import static java.lang.System.*;
// can use methods without prefix System.
// For example, getProperties();

// task 10 - randomElement from array
// static method can`t have object
//        public void randomElement (int randomIndex) {
//            int[] arr = new int[5];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = i + 1;
//            }
//            randomIndex = (int) (Math.random() * arr.length);
//            System.out.println(Arrays.toString(arr));
//            System.out.println(arr[randomIndex]);
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
