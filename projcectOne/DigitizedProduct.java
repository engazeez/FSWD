package projcectOne;
import java.io.*;
import java.util.*;

public class DigitizedProduct {
	
	 static void currentFiles( ) {
		// printing a list of files in current directory as ascending order
		System.out.println("Do you want to know all items in current dirctory?");
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("Enter the file path: ");
	     
		 
    	String dirPath = scanner.nextLine(); // Takes the directory path as the user input

        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


            // Lists only files since we have applied file filter
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

            // Creating a filter to return only files.
            FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };

            fileList = folder.listFiles(fileFilter);

            // Sort files by name
            Arrays.sort(fileList, new Comparator()
            {
                @Override
                public int compare(Object f1, Object f2) {
                    return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });

            //Prints the files in file name ascending order
            System.out.println("\nAll File Names in Directory ascending order:\n");
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }
        	}
        else 
        {
        	System.out.println("\nSorry, you entered an incorrect path.");
        	
        	
        }
       // scanner.close();
		
	 }
	            
	 
	 static void addingFile() 
	 // creating new file to current dirctory 
	 {
         Scanner scanner = new Scanner( System.in );
         System.out.println("\nAdding file to existing directory list");
         System.out.println("Enter file name: ");
         
         File newFile = new File(scanner.nextLine());
		
         try 
         {
			 if (newFile.createNewFile()) {
				System.out.println("New file is created");
			 } 
			 else {
				System.out.println("You entered existed file name");
			 }
         } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	 }
	 
	 static void deletingFile() 
	 {
         System.out.println("\nDeleting file from existing directory list");
         System.out.println("Enter file name: ");
         Scanner scanner = new Scanner( System.in );
       
      
         File newFile = new File(scanner.nextLine());
		
		 boolean b = newFile.delete();
		
		 if (b) {
			System.out.println("File deleted.");
		 }
		 else {
			System.out.println("Last file you entered stil existed, you enter invalid file name");
		}
		 
       
       
       System.out.println("\nThe application is exist now");
    }
	 
	public static void main(String[] args) throws IOException   {
		
	     currentFiles();
	     addingFile();
	     deletingFile();
	     
	}
	
}