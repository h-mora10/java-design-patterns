package behavioral.template.solved;

public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket game initialized! Start playing!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game started! Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game finished!");
    }
}
