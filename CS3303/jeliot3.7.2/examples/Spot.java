/* From java tutorial at 
 *  http://java.sun.com/docs/books/tutorial/java/concepts/practical.html
 *  Modified by: Andres Moreno 
 */

/* to execute this example you can try to call directly to 
 * the constructor, to do so, you need to check that the 
 * option in the Options menu "Ask for method". When pressing Play, 
 * you will be asked for a method, possible ones are:
 *    new Spot();
 *    new Spot().setRadius(3.0);
 *    
 *    You can as well run the main method of the class, which will calculate
 *    the area of the intersection of two spots.
 */
public class Spot {
    //instance variables
    public int x, y;
    private double radius;
    private double area;
    //constructor
    public Spot() {
    }

    public Spot(int x, int y, double radius){
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    	this.setArea();
    }
    
    //methods for access to the size instance variable    
    public void setRadius(double newRadius) {
        if (newRadius >= 0.0) {
            radius = newRadius;
            this.setArea();
        }        
    } 
    
    public int getRadius() {
        return radius;
    }
    
    private void setArea(){
    	this.area = Math.PI * Math.pow(radius,2.0);
    }
    public double getArea() {
        return area;
    }
        
    public static void main(String[] argv){
    	Spot outter = new Spot();
    	outter.setRadius(3.0);
    	Spot inner = new Spot (0,0,2.0);

    	double intersection = outter.getArea()-inner.getArea();
    	System.out.println(intersection);
    }
}