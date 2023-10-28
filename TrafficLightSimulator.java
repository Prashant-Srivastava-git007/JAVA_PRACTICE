public class TrafficLightSimulator {
    public static void main(String[] args) {
        // Simple Traffic Light: Implement a program that simulates a simple traffic
        // light with states like "Red," "Yellow," and "Green." Use a switch statement
        // to handle the transitions between states.

        String currentState = "Red";
        System.out.println("Traffic Light Simulation:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Current State: " + currentState);

            switch (currentState) {
                case "Red":
                    System.out.println("Stop!");
                    currentState = "Yellow";
                    break;
                case "Yellow":
                    System.out.println("Prepare to Go!");
                    currentState = "Green";
                    break;
                case "Green":
                    System.out.println("Go!");
                    currentState = "Red";
                    break;
                default:
                    System.out.println("Invalid state.");
                    break;
            }

            try {
                // Pause for a moment to simulate the traffic light cycle
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
