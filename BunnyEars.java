public class BunnyEars {

    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 1) {
            return 2 + bunnyEars(n - 1);
        }
        else {
            return 3 + bunnyEars(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        int totalEars = bunnyEars(n); 
        System.out.println("Total number of ears for " + n + " bunnies: " + totalEars);
    }
}


