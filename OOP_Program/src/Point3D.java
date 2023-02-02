
public class Point3D extends Point2D  {
	private float z;
// don't have para
	public Point3D () {
		super(); //call var form superclass
		this.z = 0;
	}
//have para
	public Point3D (float x,float y,float z) {
		super(x,y);
		this.z = z;
	}
	public float getZ() {
		return z;
	}
	public void setX() {
		this.z=z;
	}
	public void setXYZ(float x,float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z= z;
	}
	public float[] getXYZ() {
		float [] result = new float [3];
		result [0] = super.getX();
		result [1] = super.getY();
		result [2] =  this.z;
		return result;
		}
	
	@Override
	public String toString() {
		return super.toString()+", and "+get2();
	}
	
}	
