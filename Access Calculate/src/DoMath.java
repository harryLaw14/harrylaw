/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class DoMath {
	
	public static void main (String[] args){
		
		Calculate.square(-5);
		System.out.println(Calculate.square(-5));
		
		Calculate.cube(-5);
		System.out.println(Calculate.cube(-5));
		
		Calculate.average(-4,5);
		System.out.println(Calculate.average(-4, 5));
		
		Calculate.average(4, -5, 6);
		System.out.println(Calculate.average(4, -5, 6));
		
		Calculate.toDegrees(5);
		System.out.println(Calculate.toDegrees(5));
		
		Calculate.toRadians(5);
		System.out.print(Calculate.toRadians(5));
		
		Calculate.discriminant(6, 9, 2);
		System.out.println(Calculate.discriminant(6, 9, 2));
		
		
		
		
	}
}
