// JARVIS.java - A Stark-inspired AI assistant for Peter Parker
// By Tony Stark, April 13, 2025

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JARVIS {
    private List<Double> data;
    private String user;

    // Constructor - Initialize JARVIS
    public JARVIS(String user) {
        this.user = user;
        this.data = new ArrayList<>();
        System.out.println("JARVIS online. Greetings, " + user + ". How may I assist?");
    }

    // Load sample data (e.g., market prices)
    public void loadData() {
        // Dummy data - replace with real stuff, Parker
        double[] prices = {20.0, 21.5, 19.8, 25.0, 22.3};
        for (double price : prices) {
            data.add(price);
        }
        System.out.println("Data loaded: " + data.size() + " entries scanned.");
    }

    // Scan for anomalies (e.g., price spikes > 10%)
    public void scanForThreats() {
        if (data.isEmpty()) {
            System.out.println("No data to scan, sir. I’m not a mind reader—yet.");
            return;
        }
        double avg = data.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        for (int i = 1; i < data.size(); i++) {
            double change = (data.get(i) - data.get(i - 1)) / data.get(i - 1);
            if (Math.abs(change) > 0.1) {  // 10% threshold
                System.out.println("Alert! Anomaly at index " + i + ": " + data.get(i) + 
                                   " (Change: " + String.format("%.2f%%", change * 100) + ")");
            }
        }
        System.out.println("Scan complete. Average value: " + String.format("%.2f", avg));
    }

    // Respond to user commands
    public void respond(String command) {
        switch (command.toLowerCase()) {
            case "scan":
                scanForThreats();
                break;
            case "status":
                System.out.println("All systems nominal, " + user + ". I’m as good as vibranium.");
                break;
            case "exit":
                System.out.println("Shutting down. Don’t stick to any walls on your way out, Parker.");
                System.exit(0);
                break;
            default:
                System.out.println("Command unclear. Try 'scan', 'status', or 'exit'. I’m not JARVIS 2.0 yet!");
        }
    }

    // Main - Run JARVIS
    public static void main(String[] args) {
        JARVIS jarvis = new JARVIS("Peter");
        jarvis.loadData();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Your command, sir: ");
            String command = scanner.nextLine();
            jarvis.respond(command);
        }
    }
}
