package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
        public static boolean isPalindrome ( int number){
            number = Math.abs(number);

            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                reversedNumber = (reversedNumber * 10) + lastDigit;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return number == total;
    }


        public static String numberToWords ( int number){
            if (number < 0) {
                return "Invalid Value";
            }

            String[] words = {
                    "Zero", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine"
            };

            String numberStr = String.valueOf(number);
            String result = "";

            for (int i = 0; i < numberStr.length(); i++) {
                int digit = numberStr.charAt(i) - '0';
                result += words[digit] + " ";
            }

            return result.trim();

        }

}