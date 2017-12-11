package edu.unca.csci201;

import java.util.Calendar;
import java.util.Random;

public class DiaryMaker {
	public static void printDate(int month, int day) {
		
		
		switch (month) {
		case 1:
			System.out.print( "January -");
			break;
		case 2: 
			System.out.print("February -");
			break;
		case 3: 
			System.out.print("March -");
			break;
		case 4: 
			System.out.print("April -");
			break;
		case 5:
			System.out.print("May -");
			break;
		case 6:
			System.out.print("June -");
			break;
		case 7:
			System.out.print("July -");
			break;
		case 8:
			System.out.print("August -");
			break;
		case 9:
			System.out.print("September -");
			break;
		case 10:
			System.out.print("October -");
			break;
		case 11:
			System.out.print("November -");
			break;
		case 12:
			System.out.print("December -");
		}
		System.out.print(day);
		switch (day) {
		case 13:
			System.out.print("st");
			break;
		case 14:
			System.out.print("nd");
			break;
		case 15:
			System.out.print("rd");
			break;
			default:
				System.out.print("th");
			
			
		}
	
	System.out.print("  : ");
	
}
enum Season {Winter, Spring, Summer, Fall}


public static void main(String[] args) {
	
	
	Diary myDiary = new Diary();
	
	Calendar cal = Calendar.getInstance();
	Random rand = new Random();
	
	int month = rand.nextInt(12) + 1;
	
	cal.add(Calendar.MONTH, month);
	
	System.out.println("MY SECRET DIARY");

	System.out.println();
	
	Season tseason = Season.Fall;
	
	switch (tseason) {
	case Winter:
		System.out.println("My favorite season is Winter");
		break;
	case Spring:
		System.out.println("My favorite season is Spring");
		break;
	case Summer: 
		System.out.println("My favorite season is Summer");
		break;
	case Fall:
		System.out.println("My favorite season is Fall");
	}
	System.out.println();

	
	for (int i = 0; i < 10; i ++) {
		
		printDate(cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));

		System.out.print(myDiary.getNextEntry());
		
		System.out.println();
		System.out.println();
		
		cal.add(Calendar.DAY_OF_MONTH, rand.nextInt(12) + 1);
		
	}
}

}



