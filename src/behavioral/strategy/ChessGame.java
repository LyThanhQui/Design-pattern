package behavioral.strategy;
/*
 * The strategy design pattern allows you to change the behavior 
 * of an application that does not violate the open/closed principle (OCP)
 * By defining a family of algorithms, encapsulate each one, and make them
 * interchangeable, it makes the algorithm vary independently 
 * from the application that use it.
 * Example: Build a soccer game that allow a user play with a computer 
 * Steps:
 * 1. Create an IComputerPlayer interface
 * 2. Create 3 classes: EasyComputerPlayer, MediumComputerPlayer 
 * 	  and HardComputerPlayer that implement the IComputerPlayer interface
 * 3. Create a SoccerGame class that allow user 
 *    to play soccer with one of 3 ComputerPlayer level above     
 * 4. Create a demo program that uses the SoccerGame class
 * 
 */
public class ChessGame {
	public IComputerPlayer getComputerPlayer() {
		return computerPlayer;
	}
	public void setComputerPlayer(IComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	private IComputerPlayer computerPlayer;
	public void Move() {
		computerPlayer.MakeMove(); // exhibit the behavior
	}
}