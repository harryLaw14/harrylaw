/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	
	public static int square(int num) {
		return(num*num);
	}
	
	public static int cube(int num) {
		return(num*num*num);
	}
	
	public static double average(double num1, double num2) {
		return((num1 + num2)/2);
	}
	
	public static double average2(double num1, double num2, double num3) {
		return((num1 + num2 + num3)/2);
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
	
	public static int toImproperFrac(int A, int B, int C) {
		return ((C*A)/C);
	}
		
	public static double toMixedNum(double A, double B, double C) {
		return (A+(B/C));
	}
	
	public static int foil(int num1, int num2, int num3, int num4, int n) {
		return (((num1*n)+num2)*((num3*n)-num4));
	}
	
	public static boolean isDivisibleBy(int x, int y) {
		
		if (x%y == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double absValue(double num) {
		if (num<0) {
			return(num);
		} else {
			return(num);
		}
	}
	
	public static int max(int num1, int num2) {
		if (num1>=num2) {
			return num1;
		} else {
			return num2;
		}
	}
		
	public static double max2(int num1, int num2, int num3) {
		if (num1>num2) {
			return num1;
		} else if (num1<num2) {
			return num2;
		} else if (num1>num3) {
			return num1;
		} else if (num1<num3) {
			return num3;
		} else if (num2>num3) {
			return num2;
		} else {
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
		int product = 1;
		for (int i = 2; i<=n;i++) {
			product = product * i;
		}
		return product;
	}
		
	
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
	    	if(n%i==0) {
	    		return false;
	    	}else {
	    		return true;
	    	}
		}
	}

	public static int gcf (int num1, int num2) {
		for(int i=num1; i>0; i--) {
			if(num1%i==0&&num2%i==0) {
				Calculate.isDivisibleBy(num1, num2);
				return i;
			}
		}
	}
		
	
	public static double sqrt(double num1) {
		
	}
		
	

		
		
	
	
	
		

