import java.awt.List;

public class NameInv
{
	public static void main (final String[] args)
	{
		String test1 = "  John   ";
		String test2 = "    ";
		String test3 = " John Smith";
		String test4 = "Mrs. Phd. Ing. Eva Philips";
		String test5 = "    Mr. Phd. Ing. Prof. William Collins";
		String test6 = null;
		System.out.println(invert(test1));
		System.out.println(invert(test2));
		System.out.println(invert(test3));
		System.out.println(invert(test4));
		System.out.println(invert(test5));
		System.out.println(invert(test6));
	}
	
	public static String createTitle(String givenName)
	{
		
		String[] arrayContainingTheNames = givenName.split(" ");
		
		String title = new String(); 
		
		for(String name : arrayContainingTheNames)
		{
			if(name.endsWith("."))
				title = title.concat(name + " ");
		}
		return title;
	}
	public static String invert(String givenName)
	{
		
		String first = new String();
		String last = new String();
		String full = new String();
		
		if(givenName == null )
			return null;
		
		givenName = givenName.trim();
		
		if(givenName == "")
			return "";
		
		String title = createTitle(givenName);
		
		int positionOfLastPoint;
		positionOfLastPoint = givenName.lastIndexOf(".");
		if(positionOfLastPoint > 0)
			givenName = givenName.substring(positionOfLastPoint + 2);
		
		String[] arrayOfNames = givenName.split(" ");
		
		if(arrayOfNames.length == 1)
			return givenName;
		
		if(arrayOfNames.length == 2)
		{
			first = arrayOfNames[0];
			last = arrayOfNames[1];
		}
		
		full = full.concat(last + ", " + first + " " + title);
		
		return full;
	}
}
