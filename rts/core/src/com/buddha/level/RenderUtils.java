package com.buddha.level;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class RenderUtils {
	
	private SpriteBatch batch;
	private float lineWidth = 1;
	
	public RenderUtils(SpriteBatch batch) {
		this.batch = batch;
	}
	
	public void setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
	}
	
	public void drawLine(TextureRegion region, float x1, float y1, float x2, float y2) {
		drawLine(batch, region, lineWidth, x1, y1, x2, y2);
	}
	
	public static void drawLine(SpriteBatch batch, TextureRegion region, float width, float x1, float y1, float x2, float y2) {
		
		float dx = x2-x1;
		float dy = y2-y1;
		float invl = (float)(1/Math.sqrt(dx*dx+dy*dy));
		dx=dx*invl/2;
		dy=dy*invl/2;
		
		float col = batch.getColor().toFloatBits();
		float[] verts = new float[]{	x1-dy, y1+dx, col, region.getU(), region.getV(),
										x2-dy, y2+dx, col, region.getU2(), region.getV(),
										x2+dy, y2-dx, col, region.getU2(), region.getV2(),
										x1+dy, y1-dx, col, region.getU(), region.getV2()};
		
		batch.draw(region.getTexture(), verts, 0, verts.length);
	
	}
	
}
