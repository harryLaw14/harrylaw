//Harry Law 10/5/2016

import java.util.*;
public class ProcessingNumbers {
	
	public static void main (String[]args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter your value(s)");
		int val1 = userInput.nextInt();
		int val2 = userInput.nextInt();
		if(val1%2 == 0 && val2%2 == 0){
			System.out.println("Your numbers are good. ");
			if (val1>val2){
				System.out.println(Math.abs(val1));
			}else{
				System.out.println(Math.abs(val2));
			}
		}else{
			System.out.println("You need even numbers. "); //Try entering different values.
		}
	}

}
