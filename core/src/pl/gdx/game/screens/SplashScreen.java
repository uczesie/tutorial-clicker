package pl.gdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import pl.gdx.game.TutorialClickerGame;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;

	public SplashScreen(final TutorialClickerGame game) {
		super(game);
		init();
		
		Timer.schedule(new Task() {
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 2);
	}

	private void init() {
		// TODO assets manager
		splashImg = new Texture("badlogic.jpg");
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg,0,0);
		spriteBatch.end();
	}
	
	
}
