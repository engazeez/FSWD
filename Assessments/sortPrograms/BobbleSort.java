package sortPrograms;
import java.util.*;
public class BobbleSort {
	
public static void bubbleSort(int [] sort_arr, int len){
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }
    
    public static void main( String args[] ) {
        
        int n;  
    	Scanner scanner=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	//reading the number of elements from the that we want to enter  
    	n=scanner.nextInt();  
    	
    	//creates an array in the memory of length 10  
    	int array[] = new int[n];  
    	System.out.println("Enter the elements of the array: ");  
    	
    	for(int i=0; i<n; i++)  
    	{  
    		//reading array elements from the user   
    		array[i]=scanner.nextInt();  
    	}  
    	
        bubbleSort(array,n);

        for(int i = 0; i<n; ++i){
            System.out.print(array[i] + " ");
        }
    }
}
