package fracCalc;

import java.util.*;
public class FracCalc{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		String input;
		do{
			System.out.print("Please enter your expression or type quit: ");
			System.out.println();
			input = userInput.nextLine();
			if (!(input.equals("quit"))){
				System.out.println(produceAnswer(input)); 
			}
		}while(!(input.equals("quit")));
	}
	public static String produceAnswer(String input){
		String expression = input; 
		String[] result = expression.split(" ");
		String[] operands = parseOperands(result);
		int[] operandValues = new int[6];
		for (int i = 0; i < 6; i++){
			operandValues[i] = Integer.parseInt(operands[i]);
		}
		operandValues = toImproperFrac(operandValues);
		if (result[1].equals("+")){
			operandValues = add(operandValues);
		}
		if (result[1].equals("-")){
			operandValues = subtract(operandValues);
		}
		if (result[1].equals("*")){
			operandValues = multiply(operandValues);
		}
		if (result[1].equals("/")){
			operandValues = divide(operandValues);
		}
		operandValues = toMixedNum(operandValues);
		operandValues = reduce(operandValues);
		
		if (operandValues[1] == 0){
			return operandValues[0] + "";
		}
		else if (operandValues[0] == 0){
			if (operandValues[1] < 0 && operandValues[2] < 0){
				return (absValue(operandValues[1]) + "/" + absValue(operandValues[2]));
			}
			else if (operandValues[2] < 0){
				return (-operandValues[1] + "/" + absValue(operandValues[2]));
			}
			else{
				return (operandValues[1] + "/" + operandValues[2]);
			}
		}
		else{
			return (operandValues[0] + "_" + absValue(operandValues[1]) + "/" + absValue(operandValues[2]));
		}
	}
	public static String[] parseOperands(String[] result){
		String[] operands = new String[6];
		if (result[0].indexOf("_") > 0){
			String[] mixedNum = result[0].split("_");
			operands[0] = mixedNum[0];
			String[] fraction = mixedNum[1].split("/");
			operands[1] = fraction[0];
			operands[2] = fraction[1];
		}
		else if (result[0].indexOf("/") > 0){
			String[] frac = result[0].split("/");
			operands[0] = "0";
			operands[1] = frac[0];
			operands[2] = frac[1];
		}
		else{
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
		}
		else if (result[2].indexOf("/") > 0){
			String[] fraction = result[2].split("/");
			operands[3] = "0";
			operands[4] = fraction[0];
			operands[5] = fraction[1];
		}
		else{
			operands[3] = result[2];
			operands[4] = "0";
			operands[5] = "1";
		}
		return operands;
	}
	public static int[] toImproperFrac(int[] opValues){ //converts a mixed number to improper fraction
		int addNum1 = opValues[0] * opValues[2];
		if (addNum1 < 0){
			opValues[1] = addNum1 - opValues[1];
		}
		else{
			opValues[1] = addNum1 + opValues[1];
		}
		int addNum2 = opValues[3] * opValues[5];
		if (addNum2 < 0){
			opValues[4] = addNum2 - opValues[4];
		}
		else{
			opValues[4] = addNum2 + opValues[4];
		}
		opValues[0] = 0;
		opValues[3] = 0;
		return opValues;	
	}
	public static int[] add(int[] opValues){ //adding function
		opValues[1] = opValues[1] * opValues[5];
		opValues[4] = opValues[4] * opValues[2];
		int Denom = opValues[2];
		opValues[2] = opValues[2] * opValues[5];
		opValues[5] = opValues[5] * Denom;
		opValues[1] = opValues[1] + opValues[4];
		return opValues;
	}
	public static int[] subtract(int[] opValues){ //subtracting function
		opValues[1] = opValues[1] * opValues[5];
		opValues[4] = opValues[4] * opValues[2];
		int Denom = opValues[2];
		opValues[2] = opValues[2] * opValues[5];
		opValues[5] = opValues[5] * Denom;
		opValues[1] = opValues[1] - opValues[4];
		return opValues;
	}
	public static int[] multiply(int[] opValues){ //multiplying function
		opValues[1] = opValues[1] * opValues[4];
		opValues[2] = opValues[2] * opValues[5];
		return opValues;
	}
	public static int[] divide(int[] opValues){ //dividing function
		opValues[1] = opValues[1] * opValues[5];
		opValues[2] = opValues[2] * opValues[4];
		return opValues;
	}
	public static int[] toMixedNum(int[] opValues){ //converts improper fraction to mixed number
		opValues[0] = opValues[1] / opValues[2];							
		opValues[1] = opValues[1] % opValues[2];
		opValues[2] = opValues[2];
		return opValues;	
	}
	public static int[] reduce(int[] opValues){ //reduces the fraction
		int gcf = gcf(opValues[1], opValues[2]);
		opValues[1] = opValues[1] / gcf;
		opValues[2] = opValues[2] / gcf;
		return opValues;
	}
	public static int gcf(int x, int y){ //finds greatest common factor													
		int factor = 1;
		for (int i = 1; i <= absValue(x) && i <= absValue(y); i++){			
			if (isDivisibleBy(x, i) && isDivisibleBy(y, i)){
				factor = i;																	
			}
		}
		return factor;
	}
	public static boolean isDivisibleBy(int x, int y){ //determines if the value is divisible by the other	
		if (y == 0){											
			throw new IllegalArgumentException("Can't divide 0. Choose another number");
		}
		if (x % y == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static int absValue(int n){	//finds the absolute value	
		int answer;
		if (n >= 0){
			answer =  n;
		}
		else{
			answer = (n - (2 * n));						
		}
		return answer;
	}
}
