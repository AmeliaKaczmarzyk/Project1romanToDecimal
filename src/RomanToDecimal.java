public class RomanToDecimal {
    public static int romanToDecimal(String roman) {
        int runningSum = 0;
        int currentNumber;
        int previousNumber = 0;
        roman = roman.toUpperCase();
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
                return -1;
            }
            if (currentNumber > previousNumber){
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

    public static void main(String[] args) {
        for (String roman : args){
            int decimal = romanToDecimal(roman);
            if(decimal != -1){
                System.out.println("input: " + roman + " => output " + decimal);
            }
            else{
                System.out.println("input: " + roman + " => output => invalid"
                );
            }
        }
    }
}
