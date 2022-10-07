
public class APCompSciKidExample {

    public static int romanToDecimal(String roman){
        int sum = 0;
        for (int i = 0; i < roman.length(); i++){
            char temp = roman.charAt(i);
            if(temp == 'I'){
                sum += 1;
            }
            else if(temp == 'V'){
                sum += 5;
            }
            else if(temp == 'X'){
                sum += 10;
            }
            else if(temp == 'L'){
                sum += 50;
            }
            else if(temp == 'C'){
                sum += 100;
            }
            else if(temp == 'M'){
                sum += 1000;
            }
        }

        return sum;
    }
                public static void main(String[] args){

        for (String s: args) {
            System.out.println(s);
            for(int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
                System.out.print("\t");
                System.out.println(s.substring(i, i+1));
            }
        }
                    System.out.println("enter roman");
        // Question: How do I find if a substring exists in a string?
        String word = "chicken";
        String sub = "n";

        if(word.contains(sub))
            System.out.println(sub + " is in " + word);
        else
            System.out.println(sub + " is not in " + word);

        System.out.println(word.indexOf(sub));
    }
}