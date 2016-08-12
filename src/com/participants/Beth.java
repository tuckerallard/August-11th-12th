package com.participants;

import com.game.structure.GameMath;

public class Beth extends Opponent
{
	protected boolean isRandom = true;
	GameMath justBeth = new GameMath();
	String BethChoice = justBeth.notRandomChoice();
	
	public Beth(String name, boolean randomThrow, boolean isRandom, GameMath justBeth, String bethChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justBeth = justBeth;
		BethChoice = bethChoice;
	}

	public Beth()
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

	public GameMath getJustBeth()
	{
		return justBeth;
	}

	public void setJustBeth(GameMath justBeth)
	{
		this.justBeth = justBeth;
	}

	public String getBethChoice()
	{
		return BethChoice;
	}

	public void setBethChoice(String bethChoice)
	{
		BethChoice = bethChoice;
	}
	
	@Override
	public void takeATurn()
	{

	}

}
