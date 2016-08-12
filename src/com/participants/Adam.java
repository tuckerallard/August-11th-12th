package com.participants;

import com.game.structure.GameMath;

public class Adam extends Opponent
{
	protected boolean isRandom = true;
	GameMath justAdam = new GameMath();
	String AdamsChoice = justAdam.getRandomChoice();
	
	public Adam(String name, boolean randomThrow, boolean isRandom, GameMath justAdam, String adamsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justAdam = justAdam;
		AdamsChoice = adamsChoice;
	}

	public Adam()
	{
	}

	public boolean isRandom()
	{
		return isRandom;
	}

	public void setRandom(boolean isRandom)
	{
		this.isRandom = isRandom;
	}

	public GameMath getJustAdam()
	{
		return justAdam;
	}

	public void setJustAdam(GameMath justAdam)
	{
		this.justAdam = justAdam;
	}

	public String getAdamsChoice()
	{
		return AdamsChoice;
	}

	public void setAdamsChoice(String adamsChoice)
	{
		AdamsChoice = adamsChoice;
	}
	
	@Override
	public void takeATurn()
	{

	}
	
}
