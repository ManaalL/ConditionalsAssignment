
/**
 * @Manaal Lakhani
 * @Apr 4, 2024
 */
public class ifsAssignment
{
    /**
    * Given an integer n, returns -1 if n is negative, 0 if n is 0,
    * 1 if n is odd positive, 2 if it is even positive.
    */
    public static int evenOdd(int n){
        // Declares a method named evenOdd that takes an integer n as input
        if (n < 0){ 
            return -1;
        } // Checks if n is a negative (less than 0) and returns "-1" if it is true 
        else if (n == 0) { 
            return 0; 
        } // Checks if n is 0 and returns "0" if it is true. 
        else if (n % 2 == 1) {
            return 1; 
        } // Checks if n is a odd number using modular and returns 1 if it is. 
        else { 
            return 2;
        } // If none of the above conditions are met, n is a even number. 
    }
    /**
    * This method takes three integers, m, n and p, and
    * returns true if all three are equal and false otherwise.
    */
    public static boolean equal(int m, int n, int p){ 
        // Declares a method named equal that takes three integers m, n, and p as input
        if (m == n && n == p) {
        return true; 
        } // This checks if all three integers are equal to eachother and returns true if that is correct.
        else { 
        return false;
        } // This checks if any of the integers are not equal to eachother and returns false if that is true. 
    }
    /**
    * Returns the absolute value of a given integer n.
    */  
    public static int absolute(int n) { 
        // Declares a method named absolute that takes an integer n as input
        if (n < 0) { 
            return -n; 
        } // Checks if n is a negative number and returns the "negation" of n if n is negative, giving the absolute value
        else { 
            return n; 
        } // If n is not negative it returns n by itself since its already positive 
    }
    /**
    * Returns true if the variables x and y are both between
    * 0 (exclusive) and 1 (exclusive) and false otherwise.
    */
    public static boolean between(double x, double y) {
        // Declares a method named between that takes two double variables x and y as input
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            return true; 
        } // Checks if x and y are between 0 and 1 and returns true if they are     
        else { // If either x or y is outside the range
            return false; // Returns false
        } // Checks if either x or y is outside of the range of between 0-1 and returns false if true. 
    }
    /**
    * Returns true if integer m is a multiple of integer n.
    */
    public static boolean multiple(int m, int n) { 
        // Declares a method named multiple that takes two integers m and n as input
        if (m % n == 0) { 
            return true;
        } // Checks if m is divisble by n w/o a remainder and returns true if it is (true = m is a multiple of n)
        else {
            return false;
        } // If m is not divisble by n, return false
    }
    /**
    * Returns "Fizz" if n is a multiple of 3, "Buzz" if n is a
    * multiple of 5, "FizzBuzz" if n is a multiple of 3 and 5,
    * and the String value "Pop" otherwise
    */  
    public static String fizzBuzz(int n) { 
        // Declares a method named fizzBuzz that takes an integer n as input
        if (n % 3 == 0 && n % 5 == 0) { 
            return "FizzBuzz"; 
        } // Checks if n is a multiple of both 3 and 5 and returns "FizzBuzz" if its true 
        else if (n % 3 == 0) { 
            return "Fizz"; 
        } // Checks if n is a multiple of only 3 and returns "Fizz" if its true 
        else if (n % 5 == 0) { 
            return "Buzz"; 
        } // Checks if n is a multiple of only 5 and returns "Buzz" if n is a multiple of 5
        else { 
            return "Pop";
        } // If n is not a multiple of neither 3 or 5, return "Pop"
    }    
    /**
    * Returns true if a given year is a leap year. Check online
    * to see how a leap year is determined (wikipedia has a good
    * leap year algorithm)
    */
    public static boolean leapYear(int year) { 
            // Declares a method named leapYear that takes an integer year as input
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)); 
            // Returns true if the year is divisible by 4 and not divisible by 100 unless it's also divisible by 400
    }
    /**
    * The input is 3 single digit integers m, n and p. Returns
    * a 3-digit number in ascending order of the digits. For
    * example, if the input is 5, 2 7, the returned integer is 257.
    */
    public static int digits(int n, int m, int p) { 
        // Declares a method named digits that takes three single-digit integers n, m, and p as input
        int smallest, middle, largest; 
            // Declare variables to store smallest, middle, and largest digits
            if (n <= m && n <= p) {
                smallest = n;
            } 
            else if (m <= n && m <= p) {
                smallest = m;
            } 
            else {
                smallest = p;
            }
                // Find the smallest digit
            if (n >= m && n >= p) {
                largest = n;
            } 
            else if (m >= n && m >= p) {
                largest = m;
            } 
            else {
                largest = p;
            }
            // Finding the largest digit
        middle = n + m + p - smallest - largest;
            // Finding  the middle digit
        return smallest * 100 + middle * 10 + largest;
            // Construct the result number using the smallest, middle, and largest digits
    }
    /**
    * Given a 6-digit integer, returns true if the integer is a
    * palindrome. A palindrome is a number or word that is the
    * same forwards or backwards. For example, 541145 is a
    * palindrome. 541111 is not a palindrome.
    */
    public static boolean palindrome(int n) { 
        // Declares a method named palindrome that takes a 6-digit integer n as input
        
        int originalNumber = n; 
            // Stores the original number
        int reversedNumber = 0; 
            // Initializes a variable to store the reversed number
    
            while (n != 0) {
                int digit = n % 10; 
                    // Extracts the last digit
                reversedNumber = reversedNumber * 10 + digit; 
                    // Appends the digit to the reversed number
                n /= 10; 
                    // Removes the last digit from the original number
            }
            // Reverse the number
            
        return originalNumber == reversedNumber;
            // Check if the original number is equal to the reversed number
    }
    /**
    * Given a 3-digit integer, returns true if the integer is a
    * palintuple. A palintuple is a number that is multiple of
    * its reverse. For example, 200 is a palintuple because
    * 200 is a multiple of 002.
    */
    public static boolean palintuple(int n) { 
            // Declares a method named palintuple that takes a 3-digit integer n as input
        int reverse = ((n % 10) * 100) + ((n / 10 % 10) * 10) + (n / 100); 
            // Reverse the number
        return n % reverse == 0;
            // Check if the number is a multiple of its reverse 
            // Note: used online sources to fio the reversing part 
    }
}
