package com.buddha.rts;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public interface GameContainer {
	public SpriteBatch getBatch();
	public TextureAtlas getAtlas();
	
	
}
