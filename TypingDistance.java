import java.util.HashMap;
import java.util.Map;

public class TypingDistance {
    public static int getDistance(String word) {
        // Keyboard layout mapping
        String arr[][] = {{}}

        // Start position of the robot
        int[] currentPos = keyboard.get('*');
        int totalDistance = 0;

        for (char ch : word.toCharArray()) {
            int[] targetPos = keyboard.get(ch);
            // Calculate Manhattan distance
            int distance = Math.abs(targetPos[0] - currentPos[0]) + Math.abs(targetPos[1] - currentPos[1]);
            totalDistance += distance;
            currentPos = targetPos; // Update robot's current position
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        String word = "QA";
        System.out.println(getDistance(word)); // Output: 9
    }
}

