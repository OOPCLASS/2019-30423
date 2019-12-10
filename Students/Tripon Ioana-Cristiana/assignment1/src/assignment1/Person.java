
package assignment1;		

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {

		System.out.print("Enter name : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
		
        if (inputString != null) {
        	invert(inputString);
        }
        else 
        	System.out.println("null");

       	scanner.close();
	}
	
	public static void invert(String string) {
		String s = string.trim();
		
		if (s.contains(" "))	
        {
        	String[] arrayOfWords = s.split("\\s+");
        	int numberOfWords = arrayOfWords.length;
        	
        	for(int i = 0; i < numberOfWords; i++) {
        		arrayOfWords[i].trim();
        	}
        	String temp;
        	switch(numberOfWords) {
        		
        	  case 2:
        		arrayOfWords[1] = arrayOfWords[1].concat(",");
        		temp = arrayOfWords[0];
        	    arrayOfWords[0] = arrayOfWords[1];
        	    arrayOfWords[1] = temp;
        	    string = String.join(" ", arrayOfWords);
            	System.out.println(string);
        	    break;
        	    
        	  case 3:
        		arrayOfWords[2] = arrayOfWords[2].concat(",");
        		temp = arrayOfWords[0];
        	    arrayOfWords[0] = arrayOfWords[2];
        	    arrayOfWords[2] = temp;
          	    string = String.join(" ", arrayOfWords);
          	    System.out.println(string);
          	    break;
  
        	  case 4:
        		arrayOfWords[3] = arrayOfWords[3].concat(",");
        		  
        		temp = arrayOfWords[0];	//swap 0,3
        	    arrayOfWords[0] = arrayOfWords[3];
        	    arrayOfWords[3] = temp;
        	    
        	    temp = arrayOfWords[1];	//swap 1,2
        	    arrayOfWords[1] = arrayOfWords[2];
        	    arrayOfWords[2] = temp;
        	    
        	    temp = arrayOfWords[2];	//swap 2,3
        	    arrayOfWords[2] = arrayOfWords[3];
        	    arrayOfWords[3] = temp;
        	    
            	string = String.join(" ", arrayOfWords);
            	System.out.println(string);
            	break;
            	
        	  default:
        		  System.out.println("Wrong format");
        	}
        }
	}
}
