package chapter1;
import static java.lang.System.out;
import java.math.BigInteger;
import java.util.*;

// Chapter 1 - Fundamental structures

public class Main {

//// task 16
//    public static double average(double first, double...values) {
//        double result = first;
//        for (double v : values) result = Math.max(v, result);
//        return result;
//    }

    public static void main(String[] args) {

//// task 16 - args[]
//        System.out.println(average(13,5,13,1334));

// task 15.2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter N - number of rows in Pascal triangle: ");
//        int N = in.nextInt();
//        for (int n = 0; n < N; n++)
//        {
//            int Cnk = 1; // согласно (1)
//            out.print(Cnk);
//            for (int k = 1; k <= n; k++)
//            {
//                Cnk *= (n - k + 1); // согласно (2)
//                Cnk /= k;           // тут обязано делиться нацело
//                out.print(" ");
//                out.print(Cnk);
//            }
//            out.println();
//        }

// task 15.1
//        int c = 0;
//        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i < 10; i++) {
//            ArrayList<Integer> row = new ArrayList<Integer>();
//            for (int j = 0; j < 10; j++) {
//                row.add(c);
//                ++c;
//            }
//            arrayList.add(row);
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; ++j) {
//                System.out.format("%"+"3d", arrayList.get(i).get(j));
//            }
//            System.out.println();
//        }

// task 15 - Pascal triangle
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n - number of rows in Pascal triangle: ");
//        int n = in.nextInt();
//        //
//        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>(n);
//        // allocate rows
//        for (int i = 0; i < n; i++) {
//            int c = 1;
//
//            ArrayList<Integer> row = new ArrayList<Integer>();
//
//            // allocate elements
//            for (int j = 0; j <= i; j++) {
//
//                if (j == 0 || i == j) {
//                    row.add(1);
//                } else {
//                    c = c * (i - j + 1) / j;
//                    row.add(c);
//                }
//            }
//            triangle.add(row);
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; ++j) {
//                System.out.format("%6d", triangle.get(i).get(j));
//            }
//            System.out.println();
//        }

// task 14.1
//        boolean AllFlag = false;
//        MagicSquare test = new MagicSquare();
//
//        AllFlag = test.magic_square();
//
//        if(AllFlag)
//            System.out.println("Это магический квадрат!");
//        else
//            System.out.println("Это не магический квадрат!");

// task 14 - magic square
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter int in 4 rows with 4 element in every row.");
//
//        if (in.hasNextInt() || in.next().equals(' ')) {
//
//            int[][] square = new int[4][4];
//
//            for (int i = 0; i < square.length; i++) {
//                for (int j = 0; j < square.length; j++) {
//                    square[i][j] = in.nextInt();
//
//                }
//                System.out.println("were " + (i + 1) + " row");
//
//            }
//            in.close();
//
//            System.out.println(Arrays.deepToString(square));
//
//        } else {
//            System.out.println("empty string");
//            in.close();
//        }

// task 13 - ArrayList, sort
//        int[] arr = new int[49];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            arrList.add(arr[i]);
//        }
//        System.out.println(arrList);
//
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
//        Collections.sort(arrListWin);
//        System.out.println(arrListWin);

// task 12 - break, continue

// task 11 - unicode values
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter string (ascii and unicode): ");
//        String str = in.nextLine();
//
//        String newStr = "";
//
//        int[] intArr = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            intArr[i] = str.codePointAt(i);
//            if (intArr[i] > 255) {
//                newStr += Character.toString((char) intArr[i]);
//            } else {
//                System.out.println("Sorry, only unicode");
//                break;
//            }
//        }
//        System.out.println(newStr);

// task 10 - char, cast, codePoint
//        String letters = "abcdefghijklmnoprstuvwxyz";
//        String lettersUp = letters.substring(0,25).toUpperCase();
//        String numbers = "0123456789";
//        String str = letters + lettersUp + numbers;
//        System.out.println(str);
//
//        String randomStr = "";
//
//        ArrayList<Integer> ArrList = new ArrayList<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            ArrList.add(str.codePointAt(i));
//        }
//        System.out.println(ArrList);
//
//        int[] ArrRandom = new int[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            int randomIndex = (int) (Math.random() * str.length());
//            ArrRandom[i] = str.codePointAt(randomIndex);
//            randomStr += Character.toString((char) ArrRandom[i]);
//        }
//
//        System.out.println(Arrays.toString(ArrRandom));
//        System.out.println(randomStr);
//
//        int intStr = Integer.parseInt(randomStr, 36);
//        System.out.println(intStr);

// task 9 - compare strings
//        String s1 = "Hello 6";
//        String s2 = "hello";
//        System.out.println(s1 + " equalsIgnoreCase " + s2 + "->" + s1.equalsIgnoreCase(s2));
//        System.out.println(s1 + " compareToIgnoreCase " + s2 + "->" + s1.compareToIgnoreCase(s2));

// task 8 - substring
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String str = in.nextLine();
//        if (str == "") {
//            System.out.println(str.substring(0,5));
//        } else {
//            System.out.println("Empty string");
//        }

// task 7 - short
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter 2 numbers in a range (0 - 65535): ");
//        short value1 = in.nextShort();
//        short value2 = in.nextShort();
//        if ((value1 > 65535 || value1 < 0) || (value2 > 65535 || value2 < 0)) {
//            System.out.println("Wrong number");
//        } else {
//            System.out.println("value1 + value2 = " + (value1 + value2));
//        }

// task 6 - factorial with BigInteger
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = in.nextInt();
//        int fac = 1;
//        long time = System.currentTimeMillis();
//
//        // factorial with Loop
//        if (n == 0) {
//            System.out.println("factorial = " + fac);
//        } else {
//            for (int i = 1; i <= n; ++i) {
//                fac *= i;
//            }
//            System.out.println("factorial = " + fac);
//        }
//        System.out.println("Time taken: " + (System.currentTimeMillis() - time + " ms"));

        // factorial with BigInteger
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = in.nextInt();
//        BigInteger fac = BigInteger.valueOf(1);
//
//        long time = System.currentTimeMillis();
//        for (int i = 1; i <= n; ++i) {
//            fac = fac.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println("factorial = " + fac);
//        System.out.println("Time taken: " + (System.currentTimeMillis() - time + " ms"));

// task 5 - max int
//        double a = 2E-15;
//        int b = (int) a;
//        System.out.println(b);

// task 4 - Math.nextUp
//        double value = 0;
//        System.out.println(Math.nextUp(value) + " " + Math.nextDown(value));

// task 3 - search max value
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter 3 int values: ");
//        int value1 = in.nextInt();
//        int value2 = in.nextInt();
//        int value3 = in.nextInt();
//        int max = value1;
//        if (value2 > value1 && value2 > value3) {
//            max = value2;
//        } else if (value3 > value1 && value3 > value2) {
//            max = value3;
//        }
//        System.out.println("Max value is: " + max);
//        if ((Math.max(value1, value2) == value2 && (Math.max(value2, value3)) == value2)) {
//            max = value2;
//        } else if (((Math.max(value1, value3) == value3 && (Math.max(value2, value3)) == value3))) {
//            max = value3;
//        }
//        System.out.println("Max value is: " + max);

// task 2 - mod %
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter angle value: ");
//        int value = in.nextInt();
//        System.out.println(360 % value);
//        System.out.println(Math.floorDiv(360, value));
//        System.out.println(Math.floorMod(360, value));

// task 1 - int -> 2,8,16
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter integer value: ");
//        int value = in.nextInt();
//        System.out.println("Binary int: " + Integer.toBinaryString(value) + "\n"
//                          + "Octal int: " + Integer.toOctalString(value) + "\n"
//                            + "Hex int: " + Integer.toHexString(value));
    }
}