public class Locker {
    private final int lockerNumber;
    private String combinationCode;
    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }
    public void changeCode(String currentCode, String newCode) {
        if (this.combinationCode.equals(currentCode)) {
            this.combinationCode = newCode;
            System.out.println("success");
        } else {
            System.out.println("rejected, code is still unchanged");
        }
    }
    public int getLockerNumber() {
        return lockerNumber;
    }
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.print("Changing code from 1234 to 5678 -> ");
        l.changeCode("1234", "5678"); 
        System.out.print("Changing code from 0000 to 9999 -> ");
        l.changeCode("0000", "9999"); 
    }
}