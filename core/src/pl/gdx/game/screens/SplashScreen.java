package pl.gdx.game.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.gdx.game.TutorialClickerGame;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;

	public SplashScreen(TutorialClickerGame game) {
		super(game);
		init();
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
