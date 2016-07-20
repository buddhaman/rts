package com.buddha.rts;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class RTS extends Game implements GameContainer {
	SpriteBatch batch;
	TextureAtlas atlas;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		atlas = new TextureAtlas(Gdx.files.internal("spritesheet.txt"));
	}

	@Override
	public void render () {
		super.render();
		Gdx.gl.glClearColor(.8f, .8f, .8f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void dispose () {
		super.dispose();
		batch.dispose();
		atlas.dispose();
	}

	@Override
	public SpriteBatch getBatch() {
		return batch;
	}

	@Override
	public TextureAtlas getAtlas() {
		return atlas;
	}
}
