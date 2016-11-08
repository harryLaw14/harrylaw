//Harry Law 

package arrays_materials;

import java.util.Arrays;

public class ArraysLab3 {
	/*
	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
	 * and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	
	public static int[] sum(int[] array1, int[] array2){//adds the elements in the 2 arrays together returning a third array 
		int[] array3 = new int[array2.length];
		assert (array1.length > 0);
		assert (array2.length > 0);
		assert (array1.length == array2.length);
		for (int i = 0; i < array1.length; i++){
			array3[i] = array1[i] + array2[i];	
		}
		return array3;
	}

	/*
	 * Write a method named append that accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] array, int number){//returns n+1
		int[] updatedArray = new int[array.length + 1];
		assert (array.length > 0);
		for (int i = 0; i <= array.length-1; i++){
			updatedArray[i] = array[i];
		}
		updatedArray[array.length] = number;
		return updatedArray;
	}
	
	/*
	 * Write a method named remove that accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] array, int index) {// removes the  index at the end leading to a smaller array
		int[] newArray = new int[array.length - 1];
		assert (array.length >= 2);
		for (int i = 0; i < index; i++){
			newArray[i] = array[i];
		}
		for (int i = index + 1; i <= array.length-1; i++){
			newArray[i-1] = array[i];
		}
		return newArray;
	}
	/*
	 * Write a method sumEven that accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] array){//adds the even numbers in the array
		int evensOnly = 0;
		assert (array.length > 0);
		for (int i=0;i<=array.length-1;i+=2){
			evensOnly+=array[i];
		}
		return evensOnly;
	}
		
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */

	public static int[] rotateRight(int[] array){//rotates the position of the elements in the array to the right
		int lastElement = array[array.length - 1];
		assert (array.length > 0);
		for (int i=array.length-1;i>0;i--) {
			array[i] = array[i-1];
		}
		array[0] = lastElement;
		return array;
		
	}

	/*
	 * Write a main method that will 
		Contain
			integer arrays a1, a2, sumArr, appendArr, removeArr
			int variables appendNum, removeIdx, sumOfEvens
		Carry out the following actions
			Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
			and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
			Form sumArr by calling the sum method with a1 and a2 as inputs
			Declare int appendNum and set it to 200.
			Form appendArr by calling the append method with a1 and appendNum as inputs
			Declare int removeIdx and set it to 5.
			Form removeArr by calling remove with a2 and removeIdx
			Form sumOfEvens by calling sumEven with appendArr as the input
			Call rotateRight with a1 as the input
			On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
				sumArr
				appendArr
				removeArr
				sumOfEvens (an int you don’t need Arrays.toString)
				a1
	 */
	
	public static void main(String[] args) {
		int[] array1 = {5, 10, 15, 20, 25, 30, 35, 40};//sum of array 
		int[] array2 = {7, 14, 21, 28, 35, 42, 49, 56};//sum of array
		int [] array3 = sum(array1, array2);//sum of array
		int appendNumber = 200;//append array
		int [] updatedArray = append(array1, appendNumber);//append array
		int newArray = 5;//remove array
		int [] removeArray = remove(array2, newArray);//remove array
		int evensOnly = sumEven(updatedArray);//sum of even array
		rotateRight(array1);//rotate right array
		System.out.println(Arrays.toString(array3));//prints sum of the elements in the array in the first method
		System.out.println(Arrays.toString(updatedArray));//prints out append array
		System.out.println(Arrays.toString(removeArray));//prints out remove array
		System.out.println(evensOnly);//prints out sum of even array
		System.out.println(Arrays.toString(array1)); //prints out rotate right array
	}
}

