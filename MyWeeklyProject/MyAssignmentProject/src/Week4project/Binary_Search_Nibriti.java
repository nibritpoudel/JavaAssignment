
package Week4project;
import java.util.Scanner;

public class Binary_Search_Nibriti {

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) { 
            int mid = l + (r - l) / 2; 

            if (arr[mid] == x) 
                return mid; 

       
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

           
            return binarySearch(arr, mid + 1, r, x); 
        } 

       
        return -1; 
	}
	
	public static void main(String[] args) {
		int searchednumber;
		     int arr[] = { 2, 3, 4, 10, 40 }; 
		     int n = arr.length; 
		     Scanner num = new Scanner(System.in);
				System.out.println("Which number do you want to search?");
				searchednumber = num.nextInt();
		     int result = binarySearch(arr, 0, n - 1, searchednumber); 
		     if (result == -1) 
		         System.out.println("The number you are searching is not present"); 
		     else
		         System.out.println(" The number is found at index " + result);
		     }
		         
}
 

 

 