public class FindLowestAge {
    public static void main(String[] args) {
        int ages[] = {26, 18, 36, 45,};

        int lowestAge = ages[0];

        for (int age: ages) {
            if (lowestAge > age) {
            lowestAge = age;
        }
        }

        System.out.println("The lowest age is: " + lowestAge);
    }
}

