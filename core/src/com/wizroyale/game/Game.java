package com.wizroyale.game;

import com.wizroyale.screens.Splash;

public class Game extends com.badlogic.gdx.Game {

    @Override
    public void create () {
        setScreen(new Splash());
    }

    @Override
    public void render () {
        super.render();
    }

    @Override
    public void resize (int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause () {
        super.pause();
    }

    @Override
    public void resume () {
        super.resume();
    }

    @Override
    public void dispose () {
        super.dispose();
    }
}