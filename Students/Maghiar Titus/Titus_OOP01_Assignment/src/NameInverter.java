import java.util.regex.Pattern; 
public class NameInverter { 
 
    static String reverseName(String name) 
    { 
  
        Pattern pattern = Pattern.compile("\\s+"); 
        String[] temp = pattern.split(name); 
  
        String reversed_name = ""; 

        for (int i = 0; i < temp.length; i++) 
        { 
            if (i == temp.length - 1) 
            	reversed_name = temp[i] + reversed_name; 
        
            else
            	
            	if(temp.length<=3)
            		if(i==(temp.length-2))
            			reversed_name = ", " + temp[i] + reversed_name; 
            		else reversed_name =" " + temp[i] + reversed_name;
            	
            	else 
            	
            		if(i==1)
            			reversed_name= reversed_name + " " + temp[i];
            		
            		else
            		
            			if(i==(temp.length-2))
            				reversed_name = ", " + temp[i] + reversed_name; 
            			else reversed_name = " " + temp[i] + reversed_name; 
            		
        } 
        
        if(reversed_name.endsWith(" "))
        	reversed_name = reversed_name.substring(0, reversed_name.length() - 1);
        
        return reversed_name; 
    } 
  
    public static void main(String[] args) 
    { 
        String name = "  Titus Maghiar  "; 
        System.out.println(reverseName(name)); 
  
    } 
} 