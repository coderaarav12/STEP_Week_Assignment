public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc"};
        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result != '\0') {
                System.out.printf("\"%s\" \t First Non-Repeating Character: '%c'%n", input, result);
            } else {
                System.out.printf("\"%s\" \t No Non-Repeating Character Found%n", input);
            }
        }
    }
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequencies = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequencies[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequencies[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }
}