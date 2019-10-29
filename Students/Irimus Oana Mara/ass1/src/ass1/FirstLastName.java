package ass1;

public class FirstLastName {
	
	public static String LastFirst(String name) {
		String finalName = "";
		

        String firstName = "";
        String lastName = "";
        String title = "";

        int end = name.lastIndexOf(' ');
        int dot = name.lastIndexOf('.');
        
        if(dot > 0) {
        	title = name.substring(0, dot);  
        	firstName = name.substring(dot + 2, end);
        	lastName = name.substring(end + 1, name.length());
        	
        	finalName += lastName;
        	finalName += ",";
        	finalName += firstName;
        	finalName += title;
        	
        	//System.out.println(lastName);
            //System.out.println(",");
            //System.out.println(firstName);
            //System.out.println(title);
        }
        else {
        	if(end > 0) {
        		firstName = name.substring(0, end);
        		lastName = name.substring(end + 1, name.length());
        		
        		finalName += lastName;
        		
        		 //System.out.println(lastName);
        		 if(end > 1) {
        			 finalName += ",";
        			 //System.out.println(",");
        		 }
        		 finalName += firstName;
        	     //System.out.println(firstName);
        	}
        	else {
        			finalName += name;
        			//System.out.println(name);		
        	}
        } 
        
        return finalName; 
	}
	public static void main(final String[] args) {
		
		String name = "Mr. Dr. Eng. John Jonathan Johnson"; 
		System.out.println(LastFirst(name));
	}
	}
