//Harry Law
//2nd period
import java.util.Arrays;

public class Split {
	
	//String.split();
	//It's a method that acts on a string, <StringName>.split(<String sp>);
	//Where sp is the string where the string splits
	//And it returns an array
	// Example: "I like apples!".split(" "); 
	//		it will split at spaces and return an array of ["I","like","apples!"]
	// Example 2: "I really like really red apples"split("really")
	//		it will split at the word "really" and return an array of ["I "," like "," apples!"]


	//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString("I really really like really red apples".split("really")));
		System.out.println(Arrays.toString("I like red apples".split(" ")));
		System.out.println(sandwich_Pt1("breadmeatleetuceeadmayoketchuead"));
		System.out.println(sandwich_Pt1("breadbread"));
		System.out.println(sandwich_Pt1("bread"));
		System.out.println(sandwich_Pt1("breadsomethingbreadmeatbreadmeat"));
		System.out.println(sandwich_Pt1("cheesebreadsomethingbread"));
		System.out.println(sandwich_Pt1("cheesebreadsomethingbreadotherstuff"));
		System.out.println(sandwich_Pt1("breadbreadsomethingbread"));
		System.out.println();
		//pt1
		System.out.println(sandwich_Pt2("bread mayo bread mayo bread"));
		System.out.println(sandwich_Pt2("something bread mayo bread mayo bread"));	
		System.out.println(sandwich_Pt2("bread bread bread"));
		System.out.println(sandwich_Pt2("bread something bread bread"));
		System.out.println(sandwich_Pt2("bread something bread meat cheese bread"));
		System.out.println(sandwich_Pt2("something bread bread bread"));
		System.out.println(sandwich_Pt2("rottenstuff bread cheese bread bread meat"));
		System.out.println(sandwich_Pt2("bread bread"));
		System.out.println(sandwich_Pt2("bread"));
		//pt2
	}
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		 */
	
		public static String sandwich_Pt1(String failedSandwich){
			if(failedSandwich.indexOf("bread")<0||failedSandwich.indexOf("bread")==failedSandwich.lastIndexOf("bread"))
				return "Not a sandwich! You failed.";
			String orderedSandwich = failedSandwich.substring(failedSandwich.indexOf("bread"), failedSandwich.lastIndexOf("bread"));
			String split[] = orderedSandwich.split("bread");
			String answer="";
			for(int i=1;i<split.length;i++)
						answer=answer+split[i];
			if (answer.trim().length()==0)
				return "Not a sandwich! You failed.";
			return answer;
		}

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		 */

		public static String sandwich_Pt2(String failedSandwich){
		if(failedSandwich.indexOf("bread")<0||failedSandwich.indexOf("bread")==failedSandwich.lastIndexOf("bread"))
			return "Not a sandwich! You failed.";
		String orderedSandwich=failedSandwich.substring(failedSandwich.indexOf("bread"), failedSandwich.lastIndexOf("bread"));
		String split[] =orderedSandwich.split(" ");
		String answer="";
		for(int i=0;i<split.length;i++)
				if(!split[i].equals("bread"))
					answer=answer+split[i];
		if (answer.trim().length()==0)
			return "Not a sandwich! You failed.";
		return answer;
	}


}

			



