package com.buddha.level;

import java.util.HashMap;

import com.badlogic.gdx.utils.Array;
import com.buddha.entity.Entity;

public class Level {
	
	public HashMap<Class<? extends Entity>,  Array<? extends Entity>> entityMap;
	public Array<Entity> entityArray = new Array<Entity>();
	
	public Camera camera;
	
	public Level() {
		
	}
	
	public void update() {
		for(int i = entityArray.size-1; i >= 0; i--) {
			Entity entity = entityArray.get(i);
			if(entity.remove) 
				entityArray.removeIndex(i);
		}
		for(Array<? extends Entity> eArray : entityMap.values()) {
			for(int i = eArray.size-1; i >= 0; i--) {
				Entity entity = eArray.get(i);
				if(entity.remove) {
					entity.removeFromLevel(this);
					eArray.removeIndex(i);
				} else {
					entity.update();
				}
			}
		}
	}
	
	//handle entity adding
	public <T extends Entity> Array<T> getArrayFor(Class<T> type) {
		return (Array<T>)entityMap.get(type);
	}
	
	public <T extends Entity> void addEntity(Class<T> type, T e) {
		getArrayFor(type).add(e);
		e.addToLevel(this);
		entityArray.add(e);
	}
	
	public <T extends Entity> void addEntity(Entity e) {
		Class<T> type = (Class<T>)e.getClass();
		addEntity(type, type.cast(e));
	}
	
	public <T extends Entity> void addEntityType(Class<T> type) {
		entityMap.put(type, new Array<T>());
	}
	
}
