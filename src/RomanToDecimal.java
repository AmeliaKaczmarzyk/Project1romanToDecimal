import java.util.ArrayList;
import java.util.List;
public class RomanToDecimal {

    /**
     * @param num a number
     * @return TRUE for prime, FALSE for composite
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= (Math.sqrt(num + 1)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param roman roman numerals
     * @return decimals
     */
    public static int romanToDecimal(String roman) {
        int runningSum = 0;
        int currentNumber;
        int previousNumber = 0;
        //convert all input to UPPERCASE
        roman = roman.toUpperCase();
        //iterate through each character in the string
        for (int i = 0; i < roman.length(); i++) {
            char temp = roman.charAt(i);
            if (temp == 'I') {
                currentNumber = 1;
            } else if (temp == 'V') {
                currentNumber = 5;
            } else if (temp == 'X') {
                currentNumber = 10;
            } else if (temp == 'L') {
                currentNumber = 50;
            } else if (temp == 'C') {
                currentNumber = 100;
            } else if (temp == 'D') {
                currentNumber = 500;
            } else if (temp == 'M') {
                currentNumber = 1000;
            }
            else{
                //return -1 if the character isn't any of these valid numerals (invalid)
                return -1;
            }
            if (currentNumber > previousNumber){
                //if the previous number is smaller than the current number, subtract two previous numbers
                runningSum += currentNumber;
                runningSum = runningSum - 2 * previousNumber;
            }
            else{
                runningSum += currentNumber;
            }
            previousNumber = currentNumber;
        }
        return runningSum;
    }

    /**
     * @param args Roman numerals
     *
     */
    public static void main(String[] args) {
        int numberOfPrimes = 0;
        int numberOfUniquePrimes = 0;
        //create the list to store all the prime numbers already encountered
        List<Object> primeDecimals = new ArrayList<>();
        //iterate through each of the space separated arguments from CLI
        for (String roman : args){
            int decimal = romanToDecimal(roman);
            if(decimal != -1){
                System.out.println("input: " + roman + " => output " + decimal);
                //add to the total number of primes if is prime
                if(isPrime(decimal))numberOfPrimes++;
                //add to the number of unique primes if is prime and has not been added to the list before
                //add the new number to the list
                if(!primeDecimals.contains(decimal) && isPrime(decimal))numberOfUniquePrimes++;
                primeDecimals.add(decimal);
            }
            else{
                //print invalid output
                System.out.println("input: " + roman + " => output => invalid"
                );
            }
        }
        System.out.println("There are " + numberOfPrimes + " prime numbers in total, and " + numberOfUniquePrimes + " unique primes.");
    }
}