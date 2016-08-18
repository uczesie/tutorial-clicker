package pl.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

import pl.gdx.game.screens.SplashScreen;

public class TutorialClickerGame extends Game {

	public final static String GAME_PREFS = "pl.gdx.game.prefs";
	public final static String GAME_SCORE = "pl.gdx.game.prefs.score";
	public final static String GAME_NAME = "Tutorial Clicker";

	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;

	private boolean paused;

	private Preferences prefs;

	private int points;

	@Override
	public void create() {
		init();
		this.setScreen(new SplashScreen(this));
	}

	private void init() {
		prefs = Gdx.app.getPreferences(GAME_PREFS);
		loadScore();
	}

	private void loadScore() {
		points = prefs.getInteger(GAME_SCORE);

	}

	public void addPoint() {
		points++;
		updeteSavedScoreInPrefs();
	}
	
	public void resetGameScore() {
		points = 0;
		updeteSavedScoreInPrefs();
	}

	private void updeteSavedScoreInPrefs() {
		prefs.putInteger(GAME_SCORE, points);
		prefs.flush();
	}

	/**
	 * --------------------- getters and setters
	 * 
	 */

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public int getPoints() {
		return points;
	}
	
}
