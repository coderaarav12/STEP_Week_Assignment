public class ReverseCustomerName {
    public static void main(String[] args) {
        String customerName = "Sunil";
        String reversedName = reverseCustomerName(customerName);
        System.out.printf("\"%s\" \t Original Name: %s%n", customerName, customerName);
        System.out.printf("\t\t Reversed Name: %s%n", reversedName);
    }
    public static String reverseCustomerName(String customerName) {
        char[] nameChars = customerName.toCharArray();
        char[] reversedChars = new char[nameChars.length];
        for (int i = 0; i < nameChars.length; i++) {
            reversedChars[i] = nameChars[nameChars.length - 1 - i];
        }
        return new String(reversedChars);
    }
}