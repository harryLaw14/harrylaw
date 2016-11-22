
public class Split 
{

	public static void main(String[] args) {
		midBread("lettustomatobaconmayohambreadcheese");
		midBread("applespineapplesbreadlettustomatobaconmayoham");
		midBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		midBread("applespineapplesbreadlettustomatobaconmayohambreadcheesebreadcheese");
		midBread("applespineapplesbreadlettustomatobaconmayohambreadcheesebread");
		midBread("breadapplesbread");
		midBread("breadbreadbread");
		spaceMidBread("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}


		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		public static void spaceMidBread(String bread){
			String[] firstbread = bread.split(" bread ");
			if (firstbread.length>=1){
				for (int i = 1; i < firstbread.length - 1; i++){
					System.out.println(firstbread[i]);
				}
			}
			else{
				System.out.println("Not a real sandwich.");
		}
	}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		public static void midBread(String bread){
			bread = "apples" + bread + "apples";
			String[] firstbread = bread.split("bread");
			String[] secondbread = new String[firstbread.length];
			if (firstbread.length >= 1){
				for(int j = 0; j< firstbread.length; j++){
					secondbread[j] = firstbread[j] + ", ";
				}
				String[] thirdbread = sandwich.toString(secondbread).split(", ");
				for(int k = 1; k <= secondbread.length; k++){
					System.out.print(thirdbread[k]);
				}
				System.out.println();
			}
			else{
				System.out.println("Not a real sandwich.");
			}
		}

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		
}

			



