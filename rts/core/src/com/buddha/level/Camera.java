package com.buddha.level;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;

public class Camera {
	Vector3 pos = new Vector3();
	float angle = MathUtils.PI/2;		//angle between xy plane and camera;
	float preferedWidth = 40;
}