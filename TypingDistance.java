import java.util.HashMap;
import java.util.Map;

public class TypingDistance {
    public static int getDistance(String word) {
        // Keyboard layout mapping
        Map<Character, int[]> keyboard = new HashMap<>();
        keyboard.put('*', new int[]{2, 5}); // Star is between G and H
        keyboard.put('1', new int[]{0, 0}); keyboard.put('2', new int[]{0, 1});
        keyboard.put('3', new int[]{0, 2}); keyboard.put('4', new int[]{0, 3});
        keyboard.put('5', new int[]{0, 4}); keyboard.put('6', new int[]{0, 5});
        keyboard.put('7', new int[]{0, 6}); keyboard.put('8', new int[]{0, 7});
        keyboard.put('9', new int[]{0, 8}); keyboard.put('0', new int[]{0, 9});
        keyboard.put('Q', new int[]{1, 0}); keyboard.put('W', new int[]{1, 1});
        keyboard.put('E', new int[]{1, 2}); keyboard.put('R', new int[]{1, 3});
        keyboard.put('T', new int[]{1, 4}); keyboard.put('Y', new int[]{1, 5});
        keyboard.put('U', new int[]{1, 6}); keyboard.put('I', new int[]{1, 7});
        keyboard.put('O', new int[]{1, 8}); keyboard.put('P', new int[]{1, 9});
        keyboard.put('A', new int[]{2, 0}); keyboard.put('S', new int[]{2, 1});
        keyboard.put('D', new int[]{2, 2}); keyboard.put('F', new int[]{2, 3});
        keyboard.put('G', new int[]{2, 4}); keyboard.put('H', new int[]{2, 6});
        keyboard.put('J', new int[]{2, 7}); keyboard.put('K', new int[]{2, 7});
        keyboard.put('L', new int[]{2, 8});
        keyboard.put('Z', new int[]{3, 0}); keyboard.put('X', new int[]{3, 1});
        keyboard.put('C', new int[]{3, 2}); keyboard.put('V', new int[]{3, 3});
        keyboard.put('B', new int[]{3, 4}); keyboard.put('N', new int[]{3, 5});
        keyboard.put('M', new int[]{3, 6});

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

