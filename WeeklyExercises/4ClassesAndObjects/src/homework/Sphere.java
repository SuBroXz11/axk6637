package homework;

public class Sphere {
	
	double radius;
	
	public Sphere(double radius) { 
        this.radius = radius; 
    }
	public void  volume() {
		double volume=(4 * Math.PI * Math.pow(radius, 3)/3 );
		System.out.printf("The volume of the sphere is: %.4f ", volume);
	} 
	
	public void  surfaceArea() {
		double surfaceArea=(4 * Math.PI * Math.pow(radius, 2));
		System.out.printf("The surface area of the sphere is: %.4f ", surfaceArea);
	}

	public static void main(String[] args) {
		Sphere radius=new Sphere(7);
		radius.volume();
		System.out.println();
		radius.surfaceArea();
	}

}
