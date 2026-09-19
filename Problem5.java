public class Problem5 {
    public static String normalizeReference(String raw) {
        if (raw == null) {
            return null;
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed;
        }
        String bankCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return bankCode + rest;
    }
    public static String validateAndFormat(String reference) {
        if (reference == null || reference.length() != 14) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }
        String bankCode = reference.substring(0, 3);
        String datePart = reference.substring(3, 9);
        String seqPart = reference.substring(9);
        String dd = datePart.substring(0, 2);
        String mm = datePart.substring(2, 4);
        String yy = datePart.substring(4, 6);
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ")
          .append(dd).append("/").append(mm).append("/").append(yy)
          .append(" | SEQ: ").append(seqPart);
        return sb.toString();
    }
    public static void processReference(String raw) {
        String normalized = normalizeReference(raw);
        System.out.println(validateAndFormat(normalized));
    }
    public static void main(String[] args) {
        processReference(" hdf03022600042 ");
        processReference("12F03022600042");
    }
}