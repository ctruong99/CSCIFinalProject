package edu.unca.csci201;
import java.util.Random;

public class Diary {
	private String [] entries = {
			"Ditto",
			"Same",
			"Same as yesterday",
			"Not much today",
			"Not much today",
			"Not much today",
			"Not much today",
			"As usual",
			"Took a walk.  It was nice",
			"Took a walk.  Saw a bird.  It was nice",
			"Took a walk.  It was nice",
			"Took a walk.  Built a snowman.  It was nice",			
			"Alas! I thought to pass today with my dear family.  Have been asked to dine by Fielding; but would rather, faunte de mieux, pass the day with the Granards, wo are the oldest acquantances I have here, and old recollections have always something domestic about them.  Resolved to invite myself to dinner there, and called, but Lord G. anticipated me by asking me himself.  Told him, however, my intentions.  Lady Charlotte and Fitzgerald at dinner, and Lady Rancliffe.  Went to Mrs. Giffard's in the evening, and heard Blanzini and his wife sing some very pretty things.  Mrs. Fitzherbert too, who I thought had cut me, gave me a very kind greeting."	
	};

	private int lastEntry;
	
	
	public String getNextEntry() {
		
		Random rand = new Random();
		
		int entryNum = (lastEntry + rand.nextInt(entries.length / 2)) % entries.length;
		
		lastEntry = entryNum;
		
		return entries[entryNum];
}
}
