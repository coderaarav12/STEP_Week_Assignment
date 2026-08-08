public class Problem3_TrafficSignalStreakAnalyzer {
    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }

    static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Empty signal log");
            return;
        }

        char bestChar = signalLog.charAt(0);
        int bestLen = 1;
        char currentChar = signalLog.charAt(0);
        int currentLen = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);
            if (c == currentChar) {
                currentLen++;
            } else {
                currentChar = c;
                currentLen = 1;
            }
            if (currentLen > bestLen) {
                bestLen = currentLen;
                bestChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + bestChar + "' repeated " + bestLen + " times");
    }
}
