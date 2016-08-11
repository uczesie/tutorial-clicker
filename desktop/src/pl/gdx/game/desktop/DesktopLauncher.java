package pl.gdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.gdx.game.TutorialClickerGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TutorialClickerGame(), config);

		config.title = TutorialClickerGame.GAME_NAME;
		config.height = TutorialClickerGame.HEIGHT;
		config.width = TutorialClickerGame.WIDTH;
		config.resizable = false;
		
	}
}
