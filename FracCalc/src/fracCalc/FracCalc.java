package fracCalc;

import java.util.*;


public class FracCalc {
	
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input two mixed fractions (with underscore) separated by spaces and an operator.");
		String mixedFrac = userInput.nextLine();
		do {
			if (mixedFrac.contains(" ") && (mixedFrac.contains("+")||mixedFrac.contains("-")||mixedFrac.contains("*")||mixedFrac.contains("/"))){
				System.out.println(produceAnswer(mixedFrac));
			} 
			else {
				System.out.println("Please enter a fraction with an operator and spaces between each term.");
			}
			System.out.println("If you wish to quit, type quit");
			System.out.println("Input two mixed fractions (with underscore) separated by spaces and an operator.");
			mixedFrac = userInput.nextLine();
		}
		while (!mixedFrac.equals("quit"));
	}
	
	public static String produceAnswer(String mixedFrac){
		if (mixedFrac.contains(" ")){
			String[] partsOfFrac = mixedFrac.split(" ");
			String[] firstOperand = produceOperand(partsOfFrac, 0);
			String[] secondOperand = produceOperand(partsOfFrac, 2);
			String operator = partsOfFrac[1];
			return calculateEquation(firstOperand, secondOperand, operator);
		} else {
			return "Please enter spaces between the fractions.";
		}
	}
	
	public static String calculateEquation (String[] firstOperand, String[] secondOperand, String operator){
		int[] first = stringToInt(firstOperand);
		int[] second = stringToInt(secondOperand);
		first = toImproperFrac(first);
		second = toImproperFrac(second);
		String answer = "";
		if (operator.equals("+")){
			answer = Arrays.toString(add(first, second));
		}
		if (operator.equals("-")){
			answer = Arrays.toString(subtract(first, second));
		}
		if (operator.equals("*")){
			answer = Arrays.toString(multiply(first, second));
		}
		if (operator.equals("/")){
			answer = Arrays.toString(divide(first, second));
		}
		return answer;
	}
	
	public static String[] produceOperand(String[] partsOfFrac, int element) {
		String operand = partsOfFrac[element];
		if (operand.contains("_") && operand.contains("/")){
			return mixed(operand);
		} else if (!operand.contains("/") && !operand.contains("_")){
			return integer(operand);
		} else {
			return improper(operand);
		}
	}
	
	public static String[] mixed (String operand){
		String[] produceWhole = operand.split("_");
		String whole = produceWhole[0];
		String fraction = produceWhole[1];
		String[] produceAnswerFrac = fraction.split("/");
		String numerator = produceAnswerFrac[0];
		String denominator = produceAnswerFrac[1];
		String[] parsedFraction = {whole, numerator, denominator};
		return parsedFraction;
	}
	
	public static String[] integer (String operand){
		String whole = operand;
		String numerator = "0";
		String denominator = "1";
		String[] parsedFraction = {whole, numerator, denominator};
		return parsedFraction;
	}
	
	public static String[] improper (String operand){
		String[] produceAnswerFrac = operand.split("/");
		String numerator = produceAnswerFrac[0];
		String denominator = produceAnswerFrac[1];
		String whole = "0";
		String[] parsedFraction = {whole, numerator, denominator};
		return parsedFraction;
	}
	
	public static int[] stringToInt (String[] stringArray){
		int[] intArray = new int[3];
		for (int i = 0; i <= 2; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
	public static int[] add (int[] firstOperand, int[] secondOperand){
		int[] answer = new int[3];
		if (firstOperand[2] == secondOperand[2]){
			for (int i = 0; i <= 1; i++) {
				answer[i] = firstOperand[i] + secondOperand[i];
			}
			answer[2] = firstOperand[2];
		}
		else {
			int gcf = gcf(firstOperand[2], secondOperand[2]);
			answer[1] = firstOperand[1] * (gcf/firstOperand[2]) + secondOperand[1] * (gcf/secondOperand[2]);
			answer[2] = gcf;
		}
		return answer;
	}
	
	public static int[] subtract (int[] firstOperand, int[] secondOperand){
		int[] answer = new int[3];
		for (int i = 0; i <= 2; i++) {
			answer[i] = firstOperand[i] - secondOperand[i];
		}
		return answer;
	}
	
	public static int[] multiply (int[] firstOperand, int[] secondOperand){
		int[] answer = new int[3];
		for (int i = 0; i <= 2; i++) {
			answer[i] = firstOperand[i] * secondOperand[i];
		}
		return answer;
	}
	
	public static int[] divide (int[] firstOperand, int[] secondOperand){
		int[] answer = new int[3];
		for (int i = 0; i <= 2; i++) {
			answer[i] = firstOperand[i] / secondOperand[i];
		}
		return answer;
	}
	
	public static int[] toImproperFrac(int[] operand){
		int[] improperFrac = new int[3];
		improperFrac[0] = 0;
		improperFrac[1] = operand[0] * operand[2] + operand[1];
		improperFrac[2] = operand[2];
		return improperFrac;
	}
	
	public static String toMixedNum(int num1, int num2){
		return (num1/num2 + "_" + num1 % num2 + "/" + num2);
	}
	
	public static int gcf(int num1, int num2){
		int gcf = 1;
		if(num1 > num2){
			for(int i = num2; i >= 1; i--){
				if(num1 % i == 0 && num2 % i == 0){
					return i;
				}
			}
		} else {
			for(int j = num1; j >=1; j--){
				if(num1 % j == 0 && num2 % j == 0){
					return j;
				}
			}
		}
		return gcf;
	}
}
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
