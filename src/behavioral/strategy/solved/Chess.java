package behavioral.strategy.solved;

public class Chess {

    private ChessAlgorithm chessAlgorithm;

    public Chess() {
        chessAlgorithm = new EasyChessAlgorithm();
    }

    public int calculateNextStep() {
        return chessAlgorithm.calculateNextStep();
    }

    public void setChessAlgorithm(ChessAlgorithm chessAlgorithm) {
        this.chessAlgorithm = chessAlgorithm;
    }
}
