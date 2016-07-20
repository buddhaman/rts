package com.buddha.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.buddha.level.Level;
import com.buddha.level.LevelRenderer;
import com.buddha.rts.GameContainer;

public class GameScreen implements Screen {
	
	private GameContainer container;
	private SpriteBatch batch;
	private TextureAtlas atlas;
	
	private Level level;
	private LevelRenderer renderer;
	
	public GameScreen(GameContainer container) {
		this.container = container;
		this.batch = container.getBatch();
		this.atlas = container.getAtlas();
		this.renderer = new LevelRenderer(batch, atlas);
		this.level = new Level();
	}


	@Override
	public void render(float delta) {
		level.update();
		renderer.render(level);
	}

	@Override
	public void resize(int width, int height) {
		renderer.resize(width, height);
	}

	@Override
	public void show() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}
}
