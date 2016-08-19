package pl.gdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import pl.gdx.game.TutorialClickerGame;
import pl.gdx.game.entities.Player;
import pl.gdx.game.ui.IClickCallback;
import pl.gdx.game.ui.PlayerButton;
import pl.gdx.game.ui.ResetScoreButton;
import pl.gdx.game.ui.ScoreLabel;

public class GameplayScreen extends AbstractScreen {

	private Label scoreLabel;
	private Player player;
	private PlayerButton playerButton;
	private ResetScoreButton resetScoreButton;
	private Texture bgTexture;

	public GameplayScreen(TutorialClickerGame game) {
		super(game);
	}

	@Override
	protected void init() {
		bgTexture = new Texture("bg.png");
		initPlayer();
		initPlayerButton();
		initResetScoreButton();
		initScoreLabel();

	}

	private void initResetScoreButton() {
		resetScoreButton = new ResetScoreButton(new IClickCallback() {
			
			@Override
			public void onClick() {
				game.resetGameScore();
			}
		});
		stage.addActor(resetScoreButton);
	}

	private void initScoreLabel() {		
		scoreLabel = new ScoreLabel();
		stage.addActor(scoreLabel);
	}

	private void initPlayerButton() {
		playerButton = new PlayerButton(new IClickCallback() {
			
			@Override
			public void onClick() {
				player.reactOnClick();
				game.addPoint();			
			}
		});
		
		stage.addActor(playerButton);		
	}

	private void initPlayer() {
		player = new Player();
		stage.addActor(player);
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		spriteBatch.begin();
		spriteBatch.draw(bgTexture, 0, 0);
		spriteBatch.end();

		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		scoreLabel.setText("Score: " + game.getPoints());
		stage.act();

	}

}
