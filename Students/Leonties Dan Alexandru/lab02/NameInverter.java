package lab02;

public class NameInverter {
	
	public static void main(String[] args)
	{
		System.out.println(InvertName(null));
		
		System.out.println(InvertName(""));
		
		System.out.println(InvertName("SingleWord"));
		
		System.out.println(InvertName("FirstName LastName"));
		
		System.out.println(InvertName(" SingleWord "));
		
		System.out.println(InvertName(" FirstName LastName "));
		
		System.out.println(InvertName("Mr. FirstName LastName"));
		
		System.out.println(InvertName("Mrs. FirstName LastName"));
		
		System.out.println(InvertName("Mr. Phd. FirstName LastName"));
		
		System.out.println(InvertName("Mrs. Phd. FirstName LastName"));
		
		System.out.println(InvertName("Mr. Phd. Firstname Middlename Lastname"));
		
		System.out.println(InvertName("Mrs. Phd. Firstname Middlename Lastname"));
		
		System.out.println(InvertName("This shouldn't work"));
	}
	
	
	
	
	
	
	public static String InvertName(String input)
	
	{
		
		if( input == null )
			
			return null;
		
		if( input.length() <= 0 )
			
			return "";
		
		String[] Array = input.trim().split(" +");
		
		if(Array.length > 4)
		
			System.out.println(" Input size of String is too big! ");
		else
		
			{
				if(Array.length == 1)
			
					return Array[0];
		
				if(Array.length == 2)
			
					return Array[1] + ", " + Array[0];
		
				if(Array.length == 3 && (Array[0].equals("Mr.") || Array[0].equals("Mrs.")))
				
					return Array[2] + ", " + Array[1] + " " + Array[0]; 
		
				if(Array.length == 4 && (Array[0].equals("Mr.") || Array[0].equals("Mrs.")) && Array[1].equals("Phd."))
			
					return Array[3] + ", " + Array[2] + " " + Array[0] + " " + Array[1];
			}
	
		return "Error";
	}		
			
}			
			
			
			
			
			
		
		
		
		
		
		
		
		
	
	
	
	
	

