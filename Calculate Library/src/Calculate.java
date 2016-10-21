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
		return(Math.abs(num1 + num2)/2); //takes the average of 2 numbers
	}
	
	public static double average(double num1, double num2, double num3) {
		return((num1 + num2 + num3)/2); //takes the average of 3 numbers
	}
	
	public static double toDegrees(double num) { //converts to degrees
		return((num*3.14159)*180); 
	}
	
	public static double toRadians(double num) { //converts to radians
		return((num/3.14159)/180);
	}
	
	public static double discriminant(double a, double b, double c) {
		return ((b*b)-4*(a*c));  //finds the discriminant of the quadratic formula
	}
	
	public static int toImproperFrac() { //converts to improper fraction
		 
	}
		
	public static String toMixedNum(double A, double B, double C) { //converts to mixed number
		
	}
	
	public static int foil() { //foils the values
		
	}
	
	public static boolean isDivisibleBy(int x, int y) {
		//returns true if the remainder is zero
		//returns false if the remainder is greater than zero
		if (x/y == 0) {//x is dividend    // y is divisor
			return true;
		} else { 
			return false;
		}
	}
	
	public static double absValue(double num) {
		if (num<0) { //returns the absolute value of a number
			return(num);
		} else {
			return((-1)*num);
		}
	}
	
	public static int max(int num1, int num2) {
		if (num1>=num2) { //returns the greater number
			return num1;
		} else {
			return num2;
		}
	}
		
	public static double max (int num1, int num2, int num3) {
		if (num1>num2 && num1>num3) { //returns the greater of 3 numbers
			return num1;
		} else if (num2>num1 && num2>num3) {
			return num2;
		} else if (num3>num1 && num3>num1) {
			return num3;
		}else{
			return(0);
		}
	}
	
	public static int min(int num1, int num2) {
		if (num1>= num2) { //returns the smaller number
			return num2;
		} else {
			return num1;
		}
	}

	public static double round2(double num) {//returns a rounded number by 2 digits
		double answer;
		int round=(int)(num*100);
		if(100*num-round>=.5){
			answer= (int)(num*100+1)/100;
		}else{ 
			answer =(int)(num*100)/100;
		}
		return answer;
	}

	public static double exponent (int power, double base) {//returns the exponential value
		double answer=1.0;
			for (int k=1; k<=power; k++) {
				answer *= base;
			}
			return answer;
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
		if(n%2==0) {
	    	return true;
	    }else {
	    	return false;
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

		
	

		
		
	
	
	
		

