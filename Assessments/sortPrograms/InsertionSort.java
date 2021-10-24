package sortPrograms;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int array[], int n) {  
        int m = n;  
        for (int j = 1; j < m; j++) {  
            int key = array[j];  
            int i = j-1;  
            
            for (array[0]; array[j]; 1++) {
            	
            }
            while ( (i > -1) && ( array[i] > key ) ) {  
                array [i+1] = array[i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
    	int n;  
    	Scanner scanner=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	//reading the number of elements from the that we want to enter  
    	n=scanner.nextInt();  
    	
    	//creates an array  
    	int array[] = new int[n];  
    	System.out.println("Enter the elements of the array: ");  
    	   
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(array, n);//sorting array using insertion sort    
        System.out.println("After Insertion Sort");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    } 
}
