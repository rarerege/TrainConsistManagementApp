import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie capacities (key = bogie, value = capacity)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Display mapping
        System.out.println("Bogie Capacity Details:\n");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Program continues
        System.out.println("\nProgram continues...");
    }
}