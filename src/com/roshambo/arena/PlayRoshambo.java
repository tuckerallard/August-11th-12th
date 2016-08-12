package com.roshambo.arena;

import java.util.Scanner;
import com.game.structure.GameMath;
import com.game.structure.Validation;
import com.participants.*;

public class PlayRoshambo
{
	
	public static void main(String[] args)
	{	
		Scanner userInput = new Scanner(System.in);
		GameMath model = new GameMath();
		String opponentThrow = null;
		String choice = model.getRandomChoice();
		String opponentChoice = null;
		String userChoice = null;
		String playAgain = null;
		boolean contPlay = true;
		
		do
		{
		System.out.println("Welcome to the Roshambo Arena! Good luck!\n");
		System.out.println("What is your name?");
		String userName = userInput.nextLine().toUpperCase();
		
		System.out.println("Please choose your opponent.\n");
		System.out.println("Would you like to challenge Adam, Beth, or Tucker? Please type their name.");
		
		do
		{
			opponentChoice = userInput.nextLine();
		}
		while (Validation.isValidOpponent(opponentChoice));
		
		System.out.println("Would you like to throw"
				+"\n\t Rock"
				+"\n\t Paper"
				+"\n\t Scissors");
		do
		{
			userChoice = userInput.nextLine().toUpperCase();
		}
		
		while(Validation.isValidWeapon(userChoice));
		
		switch (opponentChoice.toUpperCase())
		{
		case "ADAM": 
			Adam adamInArena = new Adam();
			opponentThrow = adamInArena.getAdamsChoice();
			System.out.println(userName + " picked " + userChoice + "." + "\n" + opponentChoice.toUpperCase() + " picked " + opponentThrow + ".");
			break;
		case "BETH": 
			Beth bethInArena = new Beth();
			opponentThrow = bethInArena.getBethChoice();
			System.out.println(userName + " picked " + userChoice + "." + "\n" + opponentChoice.toUpperCase() + " picked " + opponentThrow + ".");
			break;
		case "TUCKER": 
			Tucker tuckerInArena = new Tucker();
			opponentThrow = tuckerInArena.getTuckersChoice();
			System.out.println(userName + " picked " + userChoice + "." + "\n" + opponentChoice.toUpperCase() + " picked " + opponentThrow + ".");
			break;

		default: System.out.println("Try again.");
			break;
		}

		String arenaOutcome = model.getGameOutcome(userChoice, opponentThrow);
	
//		GameMath.GameOutcome arenaOutcome = model.getGameOutcome(userChoice, opponentChoice);
		
		if (arenaOutcome.equalsIgnoreCase("win"))
		{
			System.out.println("\n" + userName + ", you won!");
		}
		else if (arenaOutcome.equalsIgnoreCase("lose"))
		{
			System.out.println("\n" + userName + ", you lose!");
		}
		else if (arenaOutcome.equalsIgnoreCase("tie"))
		{
			System.out.println("\n" + userName + ", you tied!");
		}
		System.out.println();
		
		do
		{
			System.out.println("Do you wish to play again?" 
				+"\n\tYes"
				+"\n\tNo");
			playAgain = userInput.nextLine();
		}
		while(Validation.isValidEntry(playAgain));
		
		if (playAgain.equalsIgnoreCase("no"))
		{
			contPlay=false;
		}
		}while(contPlay);
		userInput.close();
		System.out.println("Thanks for playing!");
		System.exit(0);
	}
	
}
