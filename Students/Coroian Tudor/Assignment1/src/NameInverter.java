
public class NameInverter 
{
	public static void main (String[] args)
	{
		System.out.println(invertName(null)); //works
		System.out.println(invertName(""));	//works
		System.out.println(invertName("Clarance")); //works
		System.out.println(invertName("   Clarance   ")); //doesn't work
		System.out.println(invertName("Mathew Clarance")); //works-ish
		System.out.println(invertName("   Mathew Clarance   ")); //doesn't work
		System.out.println(invertName("Mr. Mathew Clarance")); //works-ish
		System.out.println(invertName("Mr. Phd. Mathew Clarance")); //works-ish
	}
	public static String invertName(String str)
	{
		if  (str != null)
		{
			if (str.equals(""))
			{
				return str;
			}
			else 
			{
				if (str.indexOf(' ') == 0)
				{
					str = str.trim();
					return str;
				}
				else if (str.indexOf(' ') == -1)
				{
					return str;
				}
				else
				{
					String[] temp = str.split(" ");
					int i = 0;
					boolean flagStatus = false;
					boolean flagTitle = false;
					String newString = "";
					while (i < 4)
					{
						if (i == 0)
						{
							newString += temp[i];
							newString += " ";
							//check if Status
							if (temp[i].equals("Mr.") || temp[i].equals("Mrs.") || temp[i].equals("Ms."))
							{
								flagStatus = true;
							}
						}
						else if ( i == 1)
						{
							if (flagStatus)
							{
								//check if Title
								if (temp[i].equals("Phd."))
								{
									//put Title after Status
									flagTitle = true;
									newString += temp[i];
									newString += " ";
								}
								else 
								{
									//put FirstName before Status
									temp[i] += " ";
									newString = temp[i] + newString;
								}
							}
							else 
							{
								//put LastName before FirstName
								temp[i] += ", ";
								newString = temp[i] + newString;
							}
						}
						else if (i == 2)
						{
							//check if Status
							if (flagStatus)
							{
								//check if Title
								if (flagTitle)
								{
									//put FirstName before Status
									temp[i] += " ";
									newString = temp[i] + newString;
								}
								else 
								{
									//put LastName before FirstName
									temp[i] += ", ";
									newString = temp[i] + newString;
								}
							}
						}
						else if (i == 3)
						{
							//check if Status and Title
							if (flagStatus && flagTitle)
							{
								//put LastName before FirstName
								temp[i] += ", ";
								newString = temp[i] + newString;
							}
						}
						i ++;
					}
					str = newString;
				}
				return str;
			}
		}
		return null;
		
	}
}
