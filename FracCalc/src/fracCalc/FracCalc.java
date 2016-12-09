//Harry Law 12/9/16
package fracCalc;

import java.util.*;

public class FracCalc{
	
	public static String[] parseOperands(String[] result){ //determines the function
		String[] operands = new String[6];
		if (result[0].indexOf("_") > 0){
			String[] mixedNum = result[0].split("_");
			operands[0] = mixedNum[0];
			String[] frac = mixedNum[1].split("/");
			operands[1] = frac[0];
			operands[2] = frac[1];
		}else if (result[0].indexOf("/") > 0){
			String[] frac = result[0].split("/");
			operands[0] = "0";
			operands[1] = frac[0];
			operands[2] = frac[1];
		}else{
			operands[0] = result[0];
			operands[1] = "0";
			operands[2] = "1";
		}
		if (result[2].indexOf("_") > 0){
			String[] mixedNum = result[2].split("_");
			operands[3] = mixedNum[0];
			String[] frac = mixedNum[1].split("/");
			operands[4] = frac[0];
			operands[5] = frac[1];
		}else if (result[2].indexOf("/") > 0){
			String[] frac = result[2].split("/");
			operands[3] = "0";
			operands[4] = frac[0];
			operands[5] = frac[1];
		}else{
			operands[3] = result[2];
			operands[4] = "0";
			operands[5] = "1";
		}
		return operands;
	}
	
	public static int[] toImproperFrac(int[] opValues){ //converts a mixed number to improper fraction
		int addNum1 = opValues[0] * opValues[2]; //1st number
		if (addNum1 < 0){
			opValues[1] = addNum1 - opValues[1];
		}else{
			opValues[1] = addNum1 + opValues[1];
		}
		int addNum2 = opValues[3] * opValues[5]; //2nd number
		if (addNum2 < 0){
			opValues[4] = addNum2 - opValues[4];
		}else{
			opValues[4] = addNum2 + opValues[4];
		}
		opValues[0] = 0;
		opValues[3] = 0;
		return opValues;	
	}
	
	public static int[] toMixedNum(int[] opValues){ //converts improper fraction to mixed number
		opValues[0] = opValues[1] / opValues[2];		//whole number					
		opValues[1] = opValues[1] % opValues[2];		//numerator
		opValues[2] = opValues[2];						//denominator
		return opValues;	
	}
	
	public static int[] add(int[] opValues){ //adding function and values
		opValues[1] = opValues[1] * opValues[5];
		opValues[4] = opValues[4] * opValues[2];
		int Denom = opValues[2];
		opValues[2] = opValues[2] * opValues[5];
		opValues[5] = opValues[5] * Denom;
		opValues[1] = opValues[1] + opValues[4];
		return opValues;
	}
	
	public static int[] subtract(int[] opValues){ //subtracting function and values
		opValues[1] = opValues[1] * opValues[5];
		opValues[4] = opValues[4] * opValues[2];
		int Denom = opValues[2];
		opValues[2] = opValues[2] * opValues[5];
		opValues[5] = opValues[5] * Denom;
		opValues[1] = opValues[1] - opValues[4];
		return opValues;
	}
	
	public static int[] multiply(int[] opValues){ //multiplying function and values
		opValues[1] = opValues[1] * opValues[4];
		opValues[2] = opValues[2] * opValues[5];
		return opValues;
	}
	
	public static int[] divide(int[] opValues){ //dividing function and values
		opValues[1] = opValues[1] * opValues[5];
		opValues[2] = opValues[2] * opValues[4];
		return opValues;
	}
	
	public static int gcf(int x, int y){ //finds greatest common factor													
		int factor = 1;
		for (int j = 1; j <= absValue(x) && j <= absValue(y); j++){			
			if (isDivisibleBy(x, j) && isDivisibleBy(y, j)){
				factor = j;																	
			}
		}
		return factor;
	}
	
	public static boolean isDivisibleBy(int x, int y){ //determines if the value is divisible by the other	
		if (y == 0){											
			throw new IllegalArgumentException("Can't divide by 0.");
		}
		if (x % y == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static int absValue(int n){	//finds the absolute value	
		int answer;
		if (n >= 0){
			answer =  n;
		}else{
			answer = (n - (2 * n));						
		}
		return answer;
	}
	
	public static int[] reducefrac(int[] opValues){ //reduces the fraction
		int gcf = gcf(opValues[1], opValues[2]);
		opValues[1] = opValues[1] / gcf;
		opValues[2] = opValues[2] / gcf;
		return opValues;
	}
	
	public static String produceAnswer(String input){ //opValues is operand values
		String expression = input; 
		String[] output = expression.split(" ");
		String[] operands = parseOperands(output);
		int[] opValues = new int[6]; 
		for (int i = 0; i < 6; i++){
			opValues[i] = Integer.parseInt(operands[i]);
		}
		opValues = toImproperFrac(opValues);
		if (output[1].equals("+")){ //looks for add
			opValues = add(opValues);
		}
		if (output[1].equals("-")){
			opValues = subtract(opValues); //looks for subtract
		}
		if (output[1].equals("*")){
			opValues = multiply(opValues); //looks for multiply
		}
		if (output[1].equals("/")){
			opValues = divide(opValues); //looks for divide
		}
		opValues = toMixedNum(opValues);
		opValues = reducefrac(opValues); //looks for reducefrac aka reduce fraction
		
		if (opValues[1] == 0){
			return opValues[0] + "";
		}else if (opValues[0] == 0){
			if (opValues[1] < 0 && opValues[2] < 0){
				return (absValue(opValues[1]) + "/" + absValue(opValues[2]));
			}else if (opValues[2] < 0){
				return (-opValues[1] + "/" + absValue(opValues[2]));
			}else{
				return (opValues[1] + "/" + opValues[2]);
			}
		}else{
			return (opValues[0] + "_" + absValue(opValues[1]) + "/" + absValue(opValues[2]));
		}
	}
	
	public static void main(String[] args){ //asks user for input
		Scanner userInput = new Scanner(System.in); 
		String input;
		
		do{
			System.out.println("Enter fractions or type \"quit\" to quit: ");
			System.out.println();
			input = userInput.nextLine();
			if (!(input.equals("quit"))){ // quit 
				System.out.println(produceAnswer(input)); //resumes
			}
		}while(!(input.equals("quit")));
	}
}

//** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
// This function takes a String 'input' and produces the result
//
// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
//      e.g. input ==> "1/2 + 3/4"
//        
// The function should return the result of the fraction after it has been calculated
//      e.g. return ==> "1_1/4"