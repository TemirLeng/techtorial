package medet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop

        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome." + reverse);
        }else{
            System.out.println("Entered string/number isn't a palindrome." +reverse);
        }


        //for each

        List<String> list = new ArrayList<>();
        list.add("Lala");


        for (String s : list){
            System.out.println(s);

        }


    }
    //while loop

            public static void isPalindrome(int number) {
                int reverse = 0;
                int initNumber = number;
                while (number != 0) {
                    int lastDigit = number % 10;
                    reverse = reverse * 10;
                    reverse += lastDigit;
                    number /= 10;
                }
                //System.out.println(initNumber+"\n"+reverse);
                if (initNumber == reverse) {
                    System.out.println(reverse + " is palindrom number");

                }else{
                    System.out.println(reverse+ " is not a palindrom number");
            }
                System.out.println("lala");
            }





}
