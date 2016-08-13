package pl.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pl.gdx.game.screens.SplashScreen;

public class TutorialClickerGame extends Game {
	
	public final static String GAME_NAME = "Tutorial Clicker";
	
	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;
	
	private boolean paused;
	
	private int points;
	
	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}
	
	public void addPoint(){
		points++;
	}

	/**
     * ---------------------
     * getters and setters
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
