public class LinearSearch {

    public static int linearssearch(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return target;  
            } 
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {20, 30, 40, 60, 70};
        int target = 70;

        int result = linearssearch(arr, target);

        if (result == -1) {
            System.out.println("The number is not found");
        } else {
            System.out.println("The number founf at the index" + result);
        }       
    
    }
    
}

