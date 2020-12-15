package behavioral.strategy.current;

public class Chess {

    private Difficulty difficulty = Difficulty.EASY;

    // The algorithms are encapsulated in the Chess class.
    // We have to go through all the difficulties to get a possible response.
    // A new algorithm would imply a change in the Chess class.
    // If the code increases complexity, the Chess class would become huge and irrelevant.
    public int calculateNextStep() {
        if (difficulty == Difficulty.EASY) {
            return 1;
        } else if (difficulty == Difficulty.MEDIUM) {
            return 2;
        } else if (difficulty == Difficulty.HARD) {
            return 3;
        }

        return 0;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
