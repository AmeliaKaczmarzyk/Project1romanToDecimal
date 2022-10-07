public class RomanToDecimal {
    public static int romanToDecimal(String roman) {
        int sum = 0;
        int num = 0;
        int prevnum = 0;
        for (int i = 0; i < roman.length(); i++) {
            char temp = roman.charAt(i);
            if (temp == 'I') {
                num = 1;
            } else if (temp == 'V') {
                num = 5;
            } else if (temp == 'X') {
                num = 10;
            } else if (temp == 'L') {
                num = 50;
            } else if (temp == 'C') {
                num = 100;
            } else if (temp == 'D') {
                num = 500;
            } else if (temp == 'M') {
                num = 1000;
            }
            if (num > prevnum){
                sum += num;
                sum = sum - 2 * prevnum;
            }
            else{
                sum += num;
            }
            prevnum = num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToDecimal("MCDXCVI"));
    }
}
