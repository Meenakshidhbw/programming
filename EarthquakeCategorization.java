import java.util.Scanner; 

public class EarthquakeCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the earthquake magnitude: "); 
        
        if (scanner.hasNextDouble()) {
            double magnitude = scanner.nextDouble(); 
            
            int category =  (magnitude < 2.0) ? 1:
                            (magnitude < 4.0) ? 2:
                            (magnitude < 5.0) ? 3:
                            (magnitude < 6.0) ? 4:
                            (magnitude < 7.0) ? 5:
                            (magnitude < 8.0) ? 6: 7 ; 

            switch (category) {
                case 1:
                    System.out.println("Category: Micro (Magnitude < 2.0)\nDetected only by seismographs.");
                    break;
                case 2:
                    System.out.println("Category: Minor (Magnitude < 4.0)\nRarely felt, but recorded.");
                    break;
                case 3:
                    System.out.println("Category: Light (Magnitude < 5.0)\nFelt by people, minor damage.");
                    break;
                case 4:
                    System.out.println("Category: Moderate (Magnitude < 6.0)\nCan cause damage in populated areas. Stay indoors.");
                    break;
                case 5:
                    System.out.println("Category: Strong (Magnitude < 7.0)\nSerious damage in areas up to 100 miles. Be prepared to evacuate.");
                    break;
                case 6:
                    System.out.println("Category: Major (Magnitude < 8.0)\nSevere damage over large areas. Evacuate immediately.");
                    break;
                case 7:
                    System.out.println("Category: Great (Magnitude 8.0)\nMassive destruction. Follow emergency protocols immediately.");
                    break;
                default:
                    System.out.println("Unexpected error in categorization.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value for the magnitude.");
        }

        scanner.close();
    }
}

