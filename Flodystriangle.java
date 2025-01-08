public class Flodystriangle {
    public static void main(String[] args) {
        int currentNum = 1;

        for (int i = 1; i <=5 ; i++){
            
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
        }
        System.out.println(" ");
            
        }
    }     
}

