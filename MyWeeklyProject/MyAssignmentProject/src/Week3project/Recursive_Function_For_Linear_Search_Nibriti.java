
package Week3project;
import java.util.Scanner;

public class Recursive_Function_For_Linear_Search_Nibriti {
	
	public static void main(String[] args) {	
		int value;
		int[] num= {5,12,6,11,99,83};
		Scanner input1 = new Scanner(System.in);
		int size=num.length;
		System.out.println("Enter the number you want to search");
		value = input1.nextInt();
		int index=LinearSearch(num,0,size-1,value);
		if (index!=-1) 
        	{
				System.out.println(value+" is found at location "+(index+1));
        	}
      	else
      		{
      			System.out.println("Array doesn't have "+value+" number.");
      		}
	}	
	
	public static int LinearSearch(int num[],int start, int last,int x) {
		 if (last < start)
		        return -1;
		     if (num[start] == x)
		        return start;
		     return LinearSearch(num, start+1, last, x);
	}
}

/* The time complexity of the program is O(n)*/
