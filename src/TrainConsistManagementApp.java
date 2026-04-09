import java.util.List;
import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize an empty List using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train consist initialized successfully.");

        // Display initial bogie count
        System.out.println("Current number of bogies: " + trainConsist.size());

        // Program continues
        System.out.println("\nProgram is ready to manage the train consist.");
    }
}