package org.kata.hbou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisKataTest {

	private TennisKata tennisKata;

	@Test
	public void score_should_love_when_game_start() {
		setScore(0, 0, "love-love");
	}

	@Test
	public void score_should_love_when_player_one_win_firest_ball() {
		setScore(1, 0, "fifteen-love");
	}

	@Test
	public void score_should_thrity_when_player_one_win_two_ball() {
		setScore(2, 0, "thirty-love");
	}

	@Test
	public void score_should_forty_when_player_one_win_three_ball() {
		setScore(3, 0, "forty-love");
	}

	@Test
	public void score_should_wins_when_player_one_win_four_ball() {
		setScore(4, 0, "wins player one");
	}

	@Test
	public void score_should_deuce_when_players_win_three_ball() {
		setScore(3, 3, "deuce");
	}

	@Test
	public void score_should_advantage_when_player_one_win_advantage() {
		setScore(4, 3, "advantage player one");
	}

	@Test
	public void score_should_deuce_when_players_win_advantage() {
		setScore(4, 4, "deuce");
	}

	@Test
	public void score_should_wins_when_players_one_win_ball_after_advantage() {
		setScore(3, 5, "wins player two");
	}

	private void setScore(int playOneWinBall, int playTwoWinBall, String expectedScore) {
		tennisKata = new TennisKata();
		for (int i = 0; i < playOneWinBall; i++) {
			tennisKata.playOneScore();
		}
		for (int i = 0; i < playTwoWinBall; i++) {
			tennisKata.playtwoScore();
		}
		assertEquals(expectedScore, tennisKata.getScore());
	}
}
