public class ReverseTheString {
    public static void main(String[] args) {
        String originalString = "Hello";
        String reversedString = " ";

        for (int i=0; i<originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }

        System.err.println("The reversed string is:" + reversedString);
    }  
}


