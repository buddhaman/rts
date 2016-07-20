package com.buddha.level;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class LevelRenderer {

	private SpriteBatch batch;
	private TextureAtlas atlas;
	private RenderUtils utils;
	
	private OrthographicCamera cam;
	
	private int screenWidth;
	private int screenHeight;
	
	public LevelRenderer(SpriteBatch batch, TextureAtlas atlas) {
		this.batch = batch;
		this.atlas = atlas;
		this.utils = new RenderUtils(batch);
		screenWidth = Gdx.graphics.getWidth();
		screenHeight = Gdx.graphics.getHeight();
		cam = new OrthographicCamera(screenWidth, screenHeight);
	}
	
	public void render(Level level) {
		Camera camera = level.camera;
		cam.setToOrtho(yDown, viewportWidth, viewportHeight);
		
		batch.setProjectionMatrix(cam.combined);
	}
	
	public void resize(int width, int height) {
		this.screenWidth = width;
		this.screenHeight = height;
	}
}
