/**
 * 
 */

/**
 * Harry Law APCS2
 *
 */
public class Calculate {
	
	public static int square(int number) {
		return(number*number); //squares a number
	}
	
	public static int cube(int number) {
		return(number*number*number); //cubes a number
	}
	
	public static double average(double number1, double number2) {
		return((number1 + number2)/2); //takes the average of 2 numbers
	}
	
	public static double average(double number1, double number2, double number3) {
		return((number1 + number2 + number3)/3); //takes the average of 3 numbers
	}
	
	public static double toDegrees(double number) { //converts to degrees
		return(number*(180/3.14159)); //returns degrees
	}
	
	public static double toRadians(double number) { //converts to radians
		return((number*3.14159)/180);//returns radians
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b*b-4*a*c);  //finds the discriminant of the quadratic formula
	}
	
	public static String toImproperFrac(int wholenumber, int numerator, int denominator) { //converts to improper fraction
		 return ((wholenumber*denominator+numerator) + "/" + denominator);//returns
	}
	
	
	public static String toMixedNum(int numerator, int denominator) { //converts to mixed number
		return ((numerator/denominator)+"_"+(numerator%denominator)+"/"+(denominator));//returns
		
	}//fail
	
	public static String foil(int a, int b, int c, int d, String x){// foils the inputs
		return (a*c + "x^2 + " + a*d + b*c + "x " + b*d);//returns 
	}//fail
	
	public static boolean isDivisibleBy(int x, int y){//determines if the two inputs are divisible
		if (y == 0) {
			throw new IllegalArgumentException ("Can't Divide 0"); //Can't divide 0
		}
		if (x % y == 0){//determines if it's divisible 
			return true;//if yes, true
		}
		else{
			return false;//no, false
		}
	}
	
	public static double absValue(double num) {
		if (num<0) { //returns the absolute value of a number
			return((-1)*num);//returns the absolute value
		} else {
			return(num);//otherwise, returns the number
		}
	}
	
	public static int max(int num1, int num2) {
		if (num1>=num2) { //returns the greater number
			return num1;
		} else {
			return num2;
		}
	}
		
	public static double max (double num1, double num2, double num3) {
		if (num1>num2 && num1>num3) { //returns the greater of 3 numbers
			return num1;
		} else if (num2>num1 && num2>num3) {
			return num2;
		} else{
			return num3;
		}
	}
	
	public static int min(int num1, int num2) {
		if (num1>= num2) { //returns the smaller number
			return num2;
		} else {
			return num1;
		}
	}

	public static double round2 (double number){//rounds number up or down
		int input = ((int)(number * 100));
		if ((number * 100)-input >= .5){
			double roundsup = ((int)(number*100)+1)/100.00;//up
		    return roundsup;  
		}
		else {
			double roundsdown = (int)(number*100)/(100.00);//down
			return roundsdown;
		}
	}

	public static double exponent (double base, int power) {//returns the exponential value
		double answer=1.0;
			for (int k=1; k<=power; k++) {
				answer *= base;
			}
			return answer;
	}
	
	public static int factorial (int n) {//factorial of a number
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
	    	return false;
	    }else {
	    	return true;
	    }
	}	

	public static int gcf(int num1, int num2) { //takes 2 numbers and returns the greatest common factor
	    if (num2 == 0){
	        return Math.abs(num1);
		}else{ 
	        return Math.abs((gcf (num2, num1 % num2)));
	    }
	}
		
	
	public static double sqrt(double num1) { // takes the square root of a number
		double x;
	 
		double squareRoot = num1 / 2;
	 
		do {
			x = squareRoot;
			squareRoot = (x + (num1 / x)) / 2;
		} while ((x - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static String quadForm(int a, int b, int c){//quadratic formula
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant == 0){
			double rootOne = ((-b+discriminant)/(2*a));
			return "The Root = " +rootOne;
			
		}else if (discriminant < 0){
			return "There is no real roots";
		}else{
			double rootone = ((-b - discriminant)/(2*a));
			rootone = Calculate.round2(rootone);
			double roottwo = ((-b +discriminant)/(2*a));
			roottwo = Calculate.round2(roottwo);
			return "The first root = " + rootone + "and the second root = " + roottwo;
	 	}
	}//fail
	
}

		
	

		
		
	
	
	
		

