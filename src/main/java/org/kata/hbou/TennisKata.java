package org.kata.hbou;

public class TennisKata {
	
	private static final String LOVE = "love";
	private static final String FIFTEEN = "fifteen";
	private static final String THIRTY = "thirty";
	private static final String FORTY = "forty";
	
	private int scorePlayerOne;
	private int scorePlayerTwo;

	public String getScore() {
		if(scorePlayerOne >=3 && scorePlayerOne == scorePlayerTwo) {
			return "deuce";
		}
		if((scorePlayerOne >= 4 && scorePlayerOne == scorePlayerTwo + 1)) {
			return "advantage player one";
		}
		if(scorePlayerTwo >= 4 && scorePlayerTwo == scorePlayerOne + 1) {
			return "advantage player two";
		}
		if(scorePlayerOne >= 4 && scorePlayerOne >= scorePlayerTwo + 2) {
			return "wins player one";
		}
		if(scorePlayerTwo >= 4 && scorePlayerTwo >= scorePlayerOne + 2) {
			return "wins player two";
		}
		return toScore(scorePlayerOne) + "-" + toScore(scorePlayerTwo);
	}

	private String toScore(int score) {
		switch (score) {
		case 0:
			return LOVE;
		case 1:
			return FIFTEEN;
		case 2 :
			return THIRTY;
		case 3 :
			return FORTY;
		default:
			return LOVE;

		}
	}

	public void playOneScore() {
		scorePlayerOne++;		
	}

	public void playtwoScore() {
		scorePlayerTwo++;
	}

}
