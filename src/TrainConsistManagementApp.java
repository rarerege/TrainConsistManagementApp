import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        System.out.println("Adding bogies to the train formation...\n");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        System.out.println("Attempting to add duplicate bogie: Sleeper\n");
        trainFormation.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Program continues
        System.out.println("\nProgram continues...");
    }
}
