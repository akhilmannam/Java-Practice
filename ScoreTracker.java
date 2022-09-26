public class ScoreTracker {
    private int score1 = 0;
    private int score2 = 0;
    private int lastPlayed = 0;

    public void score(int setScore) {
        if (lastPlayed == 1) {
            score2 += setScore;
            lastPlayed = 2;
        } else {
            score1 += setScore;
            lastPlayed = 1;
        }
    }

    public int currentlyAhead() {
        if (score1 > score2) {
            return 1;
        } else if (score2 > score1) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        ScoreTracker tracker = new ScoreTracker();
        tracker.score(10);
        tracker.score(20);
        tracker.score(-20);
        tracker.score(30);
        tracker.score(40);
        tracker.score(-50);
        System.out.println("Player " + tracker.currentlyAhead() + " is currently ahead");
    }
}