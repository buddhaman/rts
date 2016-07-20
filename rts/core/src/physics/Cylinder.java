package physics;

import com.badlogic.gdx.math.Vector3;

public class Cylinder {
	//base coordinates
	public Vector3 pos;
	public float r;
	
	public Cylinder(float x, float y, float z, float r) {
		pos = new Vector3(x, y, z);
		this.r = r;
	}
	
	
}
