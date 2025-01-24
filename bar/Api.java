import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {  

    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY";

        String[][] cities = {
            {"Berlin", "52.5200", "13.4050"},   // Berlin coordinates
            {"Delhi", "28.6139", "77.2090"},    // Delhi coordinates
            {"Tokyo", "35.6762", "139.6503"}    // Tokyo coordinates 
        };

        HttpClient client = HttpClient.newHttpClient();

        for (String[] city : cities) {
            String cityName = city[0];
            String lat = city[1];
            String lon = city[2];
            String urlString = String.format("https://api.openweathermap.org/data/2.5/air_pollution?lat=%s&lon=%s&appid=%s", lat, lon, apiKey);

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(urlString))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    System.out.println("Air Quality Data for " + cityName + ":");
                    System.out.println(response.body());
                    System.out.println();
                } else {
                    System.out.println("Error: Received HTTP response code " + response.statusCode() + " for " + cityName);
                }
            } catch (Exception e) {
                System.out.println("Error fetching data for " + cityName);
                e.printStackTrace();
            }
        }
    }
}

