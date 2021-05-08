package org.kata.hbou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisKataTest {
	
	private TennisKata tennisKata;
	

	@Test
	public void score_should_love_when_game_start() {
		tennisKata = new TennisKata();
		assertEquals("love-love", tennisKata.getScore());
	}
	
	@Test
	public void score_should_love_when_player_one_win_firest_ball() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		String score = tennisKata.getScore();
		assertEquals("fifteen-love", score);
	}
	
	@Test
	public void score_should_thrity_when_player_one_win_two_ball() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		String score = tennisKata.getScore();
		assertEquals("thirty-love", score);
	}
	
	@Test
	public void score_should_forty_when_player_one_win_three_ball() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		String score = tennisKata.getScore();
		assertEquals("forty-love", score);
	}
	
	@Test
	public void score_should_wins_when_player_one_win_four_ball() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		String score = tennisKata.getScore();
		assertEquals("wins player one", score);
	}
	
	@Test
	public void score_should_deuce_when_players_win_three_ball() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		
		String score = tennisKata.getScore();
		assertEquals("deuce", score);
	}
	
	@Test
	public void score_should_advantage_when_player_one_win_advantage() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		
		String score = tennisKata.getScore();
		assertEquals("advantage player one", score);
	}
	
	@Test
	public void score_should_deuce_when_players_win_advantage() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		
		String score = tennisKata.getScore();
		assertEquals("deuce", score);
	}
	
	@Test
	public void score_should_wins_when_players_one_win_ball_after_advantage() {
		tennisKata = new TennisKata();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		tennisKata.playOneScore();
		
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		tennisKata.playtwoScore();
		
		String score = tennisKata.getScore();
		assertEquals("wins player two", score);
	}
}
