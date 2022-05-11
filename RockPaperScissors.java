import java.lang.Math;
import java.util.*;

public class RockPaperScissors{
    double compRoll = Math.random();
  Scanner scan = new Scanner(System.in);
  String playerChoice;
  String compChoice;
  String outcome;

  public void numberAssign(){
    if (compRoll <= 0.33)
      compChoice = "Rock";
    else if (compRoll > 0.33 && compRoll <= 0.66)
      compChoice = "Paper";
    else 
      compChoice = "Scissors";
  }

  public void playerTurn(){
    System.out.println("Please enter Rock, Paper, or Scissors");
    playerChoice = scan.next();
    scan.close();
   
  }

  public void battleSim(){
    if 
      (playerChoice.equals("Rock") && compChoice.equals("Rock"))
        outcome = "Draw";
    else if 
      (playerChoice.equals("Scissors") &&     compChoice.equals("Scissors"))
        outcome = "Draw";
    else if 
      (playerChoice.equals("Paper") && compChoice.equals("Paper"))
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