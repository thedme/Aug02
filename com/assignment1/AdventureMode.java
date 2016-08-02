package com.assignment1;

public class AdventureMode {
	static String[] faveMovies = { "Good Will Hunting", "Alladin", "Lion King", "Harry Potter", "Forrest Gump",
			"BatMan Returns", "A Beutiful Mind", "Toy Story", "Jaws", "It's a wonderful Life" };

	public static void main(String[] args) {

		AdventureMode ad = new AdventureMode();
		ad.printFaveMovies();
		ad.negateFaveMovies();
	}

	public AdventureMode() {

	}

	public void printFaveMovies() {
		for (int i = 0; i < faveMovies.length; i++) {

			System.out.println(faveMovies[i]);

		}
	}

	public void negateFaveMovies() {
		for (int i = 0; i < faveMovies.length; i++) {

			System.out.println("the " + faveMovies[i] + " is a horrible movie!");
		}

	}

	private int thisIsCool(int number) {
		int number1 = 5;
		return number1;
	}

	protected boolean isMovie() {
		return true;

	}

	public long serialNumber(long serialNumber) {
		serialNumber = 55555555;
		return serialNumber;
	}

	protected short attentionSpan() {
		short attention = 5;
		String time = "Seconds";
		System.out.println(attention + "/t" + time);
		return 5;
	}

	public float inOuterSpace() {
		return 0;

	}

	public String saySomeThing(String song) {
		return song;
	}

}