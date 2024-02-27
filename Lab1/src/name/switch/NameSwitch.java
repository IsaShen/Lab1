import java.util.ArrayList;
import java.util.Arrays;

public class NameSwitch {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve"));
        ArrayList<String> namesSwitched = new ArrayList<>();

        // Switch first and last letters
        for (String name : names) {
            String switchedName = switchFirstLast(name);
            namesSwitched.add(switchedName);
        }

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + namesSwitched);
    }

    // Helper method to switch first and last letters
    private static String switchFirstLast(String name) {
        if (name.length() <= 1) return name.toUpperCase();

        // Switch letters and ensure capitalization
        char firstLetter = Character.toLowerCase(name.charAt(name.length() - 1));
        char lastLetter = Character.toUpperCase(name.charAt(0));
        return lastLetter + name.substring(1, name.length() - 1) + firstLetter;
    }
}
