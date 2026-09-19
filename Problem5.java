import java.util.Arrays;
class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;
    private double compositeScore;
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        this.compositeScore = cgpa * 10 + codingScore / 2.0;
    }
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }
    public boolean checkEligibility() {
        if (isEligible(this.cgpa)) {
            return true;
        }
        return isEligible(this.cgpa, this.codingScore);
    }
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore, this.compositeScore);
    }
    public String getName() {
        return name;
    }
    public double getCompositeScore() {
        return compositeScore;
    }
}
public class Problem5 {
    static String shortlistAndRank(Candidate[] candidates) {
        int count = 0;
        for (Candidate c : candidates) {
            if (c.checkEligibility()) {
                count++;
            }
        }
        Candidate[] shortlisted = new Candidate[count];
        int index = 0;
        for (Candidate c : candidates) {
            if (c.checkEligibility()) {
                shortlisted[index++] = c;
            }
        }
        Arrays.sort(shortlisted);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            if (i > 0) sb.append(" | ");
            sb.append((i + 1)).append(". ").append(shortlisted[i].getName())
              .append(" (").append(shortlisted[i].getCompositeScore()).append(")");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));
    }
}