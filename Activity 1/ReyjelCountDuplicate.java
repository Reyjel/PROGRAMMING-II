import java.util.LinkedHashMap;
import java.util.Map;
public class ReyjelCountDuplicate {

    public static void main(String[] args) {
        printCountOfDuplicateCharacterUsingHashMap("But in my head there's something I can feel tugging and struggling Angels fight with devils And here's what they want from me They're askin' me to eliminate some of the women hate But if you take into consideration the bitter hatred I have, then you may be a little patient And more sympathetic to the situation And understand the discrimination");
        printCountOfDuplicateCharacterUsingHashMap("##^$!%^$!^%@!$^@!kds");

    }

    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharacterUsingHashMap(String input) {

        Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)) {
                output.put(ch, output.get(ch) + 1);
            } else {
                output.put(ch, 1);
            }

        }

        System.out.println(output);

    }


}
