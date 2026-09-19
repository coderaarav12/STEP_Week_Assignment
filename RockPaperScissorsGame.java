import java.util.Random;
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        int rounds = 5;
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0;
        int losses = 0;
        int draws = 0;
        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = generateComputerMove();
            String result = playRound(playerMoves[i], computerMoves[i]);
            results[i] = result;
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }
        for (int i = 0; i < rounds; i++) {
            System.out.printf("Round %d - Player: %s, Computer: %s \t %s%n",
                    (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println();
        double winPercentage = (wins * 100.0) / rounds;
        System.out.printf("Final Summary (after %d rounds) \t Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", 
                rounds, wins, losses, draws, winPercentage);
    }
    public static String generateComputerMove() {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        return moves[random.nextInt(3)];
    }
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }
}