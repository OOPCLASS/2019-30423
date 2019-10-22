// Just change the string fullName and run
public class Main
{
	
	public static void Invert(String giveName)
	{
		String nameToPrint;
		String[] splitNames = giveName.trim().split(" ", 2);
		
		nameToPrint = splitNames[1].trim() + ", " + splitNames[0].trim();
				
		System.out.print(nameToPrint);
		
	}
	
	public static void domniDoamneDoctoranzi(String giveName)
	{
		String nameToPrint;
		if( giveName.contains("Mr. Phd.") )
		{
			String[] splitNames = giveName.trim().split(" ", 4);
			nameToPrint = splitNames[3] + ", " + splitNames[2] + " " + splitNames[0] + " " + splitNames[1];
			System.out.print(nameToPrint);
			return;
		}
		
		if( giveName.contains("Mr.") )
		{
			String[] splitNames = giveName.trim().split(" ", 3);
			nameToPrint = splitNames[2] + ", " + splitNames[1] + " " + splitNames[0];
			System.out.print(nameToPrint);
			return;
		}
		
		if( giveName.contains("Mrs.") )
		{
			String[] splitNames = giveName.trim().split(" ", 3);
			nameToPrint = splitNames[2] + ", " + splitNames[1] + " " + splitNames[0];
			System.out.print(nameToPrint);
			return;
		}
		
			
	}
	public static void main(String[] args)
	{
		String fullName = "Mr. Phd. Andrei Rodgers";                                           //Here is the string
		char ch = '"';
		
		if( fullName == "" )
		{
			System.out.print(ch);
			System.out.print(ch);
		}
		
		if( fullName == null)
		{
			System.out.print("null");
			System.exit(0);
		}
		
		if( !fullName.trim().contains(" ") )
			System.out.print(fullName.trim());
		else
		if( !fullName.contains("Mr. Phd.") && !fullName.contains("Mr.") && !fullName.contains("Mrs.") )
			Invert(fullName);
		else
			domniDoamneDoctoranzi(fullName);
			
	}

}
