public class Problem4 {
    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() >= 3) {
            return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
        }
        return trimmed.toUpperCase();
    }
    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            System.out.println("Invalid: wrong length");
            return null;
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                System.out.println("Invalid: publisher code must be 3 letters");
                return null;
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                System.out.println("Invalid: non-digit body");
                return null;
            }
        }
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ")
          .append("YEAR: ").append(year).append(" | ")
          .append("CATALOG: ").append(catalog);
        return sb.toString();
    }
    public static void main(String[] args) {
        String normalized1 = normalizeCode(" pen2026004251 ");
        String result1 = validateAndFormat(normalized1);
        if (result1 != null) {
            System.out.println(result1);
        }
        String normalized2 = normalizeCode("12N2026004251");
        String result2 = validateAndFormat(normalized2);
        if (result2 != null) {
            System.out.println(result2);
        }
    }
}