package io.github.wow;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Gamee extends Game {

    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}
