package behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		ChessGame game = new ChessGame();

        game.setComputerPlayer(new EasyComputerPlayer());
        game.Move();   //move using Easy difficulty

        game.setComputerPlayer(new MediumComputerPlayer());
        game.Move();   //move using Medium difficulty

        game.setComputerPlayer(new AdvancedComputerPlayer());
        game.Move();   //move using Advanced difficulty
	}

}
