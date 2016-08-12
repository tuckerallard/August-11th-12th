package com.game.structure;

import java.util.Enumeration;

public class GameMath
{
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	
	public static enum GameOutcome
	{
		WIN, LOSE, TIE
	}
	
	public String getGameOutcome(String userChoice, String opponentChoice)
	{
		if(userChoice.equalsIgnoreCase("ROCK"))
		{
			if (opponentChoice.equalsIgnoreCase("PAPER"))
			{
				losses++;
				return "lose";
			}
		
			else if (opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				wins++;
				return "win";
			}
		}
		else if(userChoice.equalsIgnoreCase("PAPER"))
		{
			if (opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				losses++;
				return "lose";
			}
		
			else if (opponentChoice.equalsIgnoreCase("ROCK"))
			{
				wins++;
				return "win";
			}
		}
		else if(userChoice.equalsIgnoreCase("SCISSORS"))
		{
			if (opponentChoice.equalsIgnoreCase("ROCK"))
			{
				losses++;
				return "lose";
			}
		
			else if (opponentChoice.equalsIgnoreCase("PAPER"))
			{
				wins++;
				return "win";
			}
		}
		else if (opponentChoice.equalsIgnoreCase(userChoice))
		{
			ties++;
			return "tie";
		
		}
		return null;
	}
	
	public String getRandomChoice()
	{
		double d = Math.random();
		
		if (d < .33)
		{
			return "ROCK";
		}
		else if (d < .66)
		{
			return "PAPER";
		}
		else
		{
			return "SCISSORS";
		}
	}
	
	public String notRandomChoice()
	{
		return "SCISSORS";
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLosses()
	{
		return losses;
	}
	
	public int getTies()
	{
		return ties;
	}
	
}
