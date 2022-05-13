// importing Math to use Math.random function for computer turn calculation
import java.lang.Math;
// importing Scanner so that user input can be collected
import java.util.*;

public class RockPaperScissors{
	
// compRoll is used to randomly generate a value for the computer turn calculation	
  double compRoll = Math.random();
	
// scan is the Scanner object for collecting user input
  Scanner scan = new Scanner(System.in);

  String playerChoice;
  String compChoice;
  String outcome;

/* Since Math.random generates a value between 0 and 1 the numberAssign function evaluates the possible 
values and then assigns them to Rock, Paper, or Scissors based off where they fall in that spectrum using 
conditional logic */
  public void numberAssign(){
    if (compRoll <= 0.33)
      compChoice = "Rock";
    else if (compRoll > 0.33 && compRoll <= 0.66)
      compChoice = "Paper";
    else 
      compChoice = "Scissors";
  }

/* playerTurn prompts the user to provide an input and then assigns the Scanner input to the 
playerChoice String */
  public void playerTurn(){
    System.out.println("Please enter Rock, Paper, or Scissors");
    playerChoice = scan.next();
    scan.close();
  }

/* The battleSim function is a 8 way conditional that compares all possible combinations of playerChoice and compChoice
and then sets the outcome String based on the criteria */
  public void battleSim(){
    if 
      (playerChoice.equals(compChoice))
        outcome = "Draw";
    else if 
      (playerChoice.equals("Paper") && compChoice.equals("Rock"))
        outcome = "Player Wins";
    else if 
      (playerChoice.equals("Scissors") && compChoice.equals("Paper"))
        outcome = "Player Wins";
    else if 
      (playerChoice.equals("Rock") && compChoice.equals("Scissors"))
        outcome = "Player Wins";
     else if 
      (playerChoice.equals("Paper") && compChoice.equals("Scissors"))
        outcome = "Computer Wins";
      else if 
      (playerChoice.equals("Rock") && compChoice.equals("Paper"))
        outcome = "Computer Wins";
      else if 
      (playerChoice.equals("Scissors") && compChoice.equals("Rock"))
        outcome = "Computer Wins";
      else 
        outcome = "Outcome cannot be determined, player provided invalid input";
    }
	
	public static void main(String[] args){

// Instantiating the RockPaperScissors game object 
    RockPaperScissors RockPaperScissors = new RockPaperScissors();

    System.out.println("<==================>");
    RockPaperScissors.playerTurn();
    RockPaperScissors.numberAssign();
    System.out.println("<==================>");
    System.out.println("Player chooses " + RockPaperScissors.playerChoice);
    System.out.println("Computer chooses " + RockPaperScissors.compChoice);
    RockPaperScissors.battleSim();
    System.out.println(RockPaperScissors.outcome);
    
    
  }

}
