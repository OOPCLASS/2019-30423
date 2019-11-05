
public class Inverter {
	public static String invertName(String name)
	{
		String[] words_with_spaces;
		String[] words = {"", "", "", ""};
		
		if(name == null)
			return null;
		
		words_with_spaces = name.split(" ");
		
		int i = 0;
		
		for(String index : words_with_spaces)
		{
			if(index.length() > 2)
			{
				words[i] = index;
				i++;
			}
		}
		
		if(i == 4)
		{
			return words[3] + ", " + words[2] + " " + words[0] + " " + words[1];
		}
		else if(i == 3)
		{
			return words[2] + ", " + words[1] + " " + words[0];
		}
		else if(i == 2)
		{
			return words[1] + ", " + words[0];
		}
		else if(i == 1)
		{
			return words[0];
		}
		else
		{
			return name;
		}
	}
	
	public static void main(String[] args) 
	{	
		System.out.println(invertName(null));
		System.out.println(invertName(""));
		System.out.println(invertName("   Nicolae   "));
		System.out.println(invertName(" Nicolae    Baciu   "));
		System.out.println(invertName("    Mr.  Nicolae    Baciu   "));
		System.out.println(invertName("    Mr. Phd.   Nicolae    Baciu   "));
		
	}
}
