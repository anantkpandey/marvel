// SpideyDecision.java - Happy Hogan helps Peter Parker decide
public class SpideyDecision {
    public static void main(String[] args) {
        System.out.println("Spider-Man’s Dilemma - Happy’s Plan");

        // Spidey’s data (tweak it, Pete!)
        String mission = "Save World";
        int threatLevel = 70;        // Threat severity (0-100)
        int classPriority = 40;      // Class importance (0-100)
        boolean auntMayUpset = false; // May’s mood

        // Decision logic with if-else and logical operators
        if (threatLevel >= 60 && classPriority < 50 && !auntMayUpset) {
            System.out.println("Swing out, Spidey! " + mission + " calls!");
            System.out.println("Threat: " + threatLevel + "%, Class: " + classPriority + "%, May’s Cool: Yes");
        } else if (threatLevel >= 60 && classPriority >= 50) {
            System.out.println("Threat’s high (" + threatLevel + "%) but class matters (" + classPriority + "%). Split time, kid!");
        } else if (threatLevel < 60 && classPriority >= 50 && !auntMayUpset) {
            System.out.println("Class first—threat’s low (" + threatLevel + "%), priority’s " + classPriority + "%. Hit the books!");
        } else if (threatLevel >= 60 && auntMayUpset) {
            System.out.println("Threat’s " + threatLevel + "%, but May’s mad. Call Tony—save world quiet-like!");
        } else {
            System.out.println("Chill, Pete—threat’s " + threatLevel + "%, class: " + classPriority + "%, May’s fine. Nap time!");
        }

        // Happy’s advice
        if (threatLevel > 80 || classPriority > 70) {
            System.out.println("Big stakes, kid—focus up, or I’m telling Tony!");
        }
    }
}