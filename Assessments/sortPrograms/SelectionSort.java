package sortPrograms;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
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
          
        selectionSort(array);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
    }  
}
