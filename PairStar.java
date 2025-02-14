public class PairStar {
    public static String pairStar(String str) {
        if(str.length() <= 1) {
            return str;
        }
        
        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        else;
           return str.charAt(0) + pairStar(str.substring(1));

    }

    public static void main(String[] args) {
        String input = "helloaabb";
        String output = pairStar(input);
        System.out.println("The pair star is:" + output);

        }
}

