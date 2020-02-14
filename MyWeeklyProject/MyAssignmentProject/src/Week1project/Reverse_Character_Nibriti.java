
package Week1project;
import java.util.Scanner;


//To reverse the given characters
public class Reverse_Character_Nibriti {

	public static void main(String[] args) {
		String word;
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the word you want to reverse");
		word = str.nextLine();
		String reversedValue = reverse(word);//Calling the reverse function
		System.out.println("The reversed value of "+word+" is "+ reversedValue);

	}
	public static String reverse(String input) {
		char[] a = input.toCharArray();
		int start=0;
		int end= a.length-1;
		char let;
		while(end>start) {
			let = a[start];
			a[start]=a[end];
			a[end]=let;
			end--;
			start++;
		}
		return new String(a);
	}

}
