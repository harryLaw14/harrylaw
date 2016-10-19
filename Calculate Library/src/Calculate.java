/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	
	public static int square(int num) {
		return(num*num); //squares a number
	}
	
	public static int cube(int num) {
		return(num*num*num); //cubes a number
	}
	
	public static double average(double num1, double num2) {
		return((num1 + num2)/2); //takes the average of 2 numbers
	}
	
	public static double average(double num1, double num2, double num3) {
		return((num1 + num2 + num3)/2); //takes the average of 3 numbers
	}
	
	public static double toDegrees(double num) {
		return((num*3.14159)*180); 
	}
	
	public static double toRadians(double num) {
		return((num/3.14159)/180);
	}
	
	public static double discriminant(double num1, double num2, double num3) {
		return ((num2*num2)-4*(num1*num3));  
	}
	
	public static int toImproperFrac() {
		int x = 3;
		int y = 1;
		int z = 2;
		int answer = ((x+y+z)/2);
		return answer; 
	}
		
	public static String toMixedNum(double A, double B, double C) {
		return ();
	}
	
	public static int foil(int num1, int num2, int num3, int num4, int n) {
		return (((num1*n)+num2)*((num3*n)-num4)); 
	}
	
	public static boolean isDivisibleBy(int x, int y) {
		//returns true if the remainder is zero
		//returns false if the remainder is greater than zero
		if (x%y == 0) {
			return true;
		} else { 
			return false;
		}
	}
	
	public static double absValue(double num) {
		if (num<0) { //returns the absolute value of a number
			return(num);
		} else {
			return(num);
		}
	}
	
	public static int max(int num1, int num2) {
		if (num1>=num2) { //returns the greater number
			return num1;
		} else {
			return num2;
		}
	}
		
	public static double max2(int num1, int num2, int num3) {
		if (num1>num2 && num1>num3) { //returns the greater of 3 numbers
			return num1;
		} else if (num2>num1 && num2>num3) {
			return num2;
		} else if (num3>num1 && num3>num1) {
			return num3;
		}
	}
	
	public static int min(int num1, int num2) {
		if (num1>= num2) {
			return num2;
		} else {
			return num1;
		}
	}

	public static double round2(double num1) {
		double answer;
		int rounded=(int)(num1*100);
		if(100*num1-rounded>=.5)
			answer= (int)(num1*100+1)/100;
		else 
			answer =(int)(num1*100)/100;
	}

	public static double exponent (int power, double base) {
		double answer =1.0;
			for (int k =1; k<= power; k++) {
				answer *= base;
			}
	}
	
	public static int factorial (int n) {
		if (n<0){
			throw new IllegalArgumentException ("-n");
		}
		int product = 1;
		for (int i = 2; i<=n;i++) {
			product = product * i;
		}
		return product;
	}
		
	
	public static boolean isPrime(int n) { //determines whether a number is prime or not.
		for(int i=2;i<n;i++) {
	    	if(n%i==0) {
	    		return false;
	    	}else {
	    		return true;
	    	}
		}
	}

	public static int gcf(int num1, int num2) {
	    if (num2 == 0){
	        return Math.abs(num1);
		}else{ 
	        return Math.abs((gcf (num2, num1 % num2)));
	    }
	}
		
	
	public static double sqrt(double num1) {
		double x;
	 
		double squareRoot = num1 / 2;
	 
		do {
			x = squareRoot;
			squareRoot = (x + (num1 / x)) / 2;
		} while ((x - squareRoot) != 0);
	 
		return squareRoot;
	}
	
}

		
	

		
		
	
	
	
		

