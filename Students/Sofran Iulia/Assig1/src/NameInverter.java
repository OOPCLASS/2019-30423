import java.util.Scanner;

public class NameInverter
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine(); 				// read string
		
		if (myString != null && !myString.isEmpty()) 		// if string is not empty
		{
			InvertName(myString);
		}
		else
			System.out.println("null");
	}
	
	public static void InvertName(String myString)
	{
		int w;
		String str = myString.strip(); 					// remove white spaces at the beginning and at the end
		
		if (str.contains(" ")) 							// if string has more than one word
		{
			
			String trim = str.trim();
			w = trim.split("\\s+").length; 				// w = the number of words
			String[] parts = str.split("\\s+"); 		// split the string by white spaces
			if (w == 2)
			{
				String part1 = parts[0];
				String part2 = parts[1];
				System.out.print(part2 + ", ");
				System.out.println(part1);
			}
			else if (w == 3)
			{
				String part1 = parts[0];
				String part2 = parts[1];
				String part3 = parts[2];
				if (part1.equals("Mr.") || part1.equals("Mrs."))
				{
					System.out.print(part3 + ", ");
					System.out.print(part2 + " ");
					System.out.print(part1);
				}
				else
					System.out.print("Wrong format.");
			}
			else if (w == 4)
			{
				String part1 = parts[0];
				String part2 = parts[1];
				String part3 = parts[2];
				String part4 = parts[3];
				if ((part1.equals("Mr.") || part1.equals("Mrs.")) && part2.equals("Phd."))
				{
					System.out.print(part4 + ", ");
					System.out.print(part3 + " ");
					System.out.print(part1 + " ");
					System.out.print(part2);
				}
				else
					System.out.print("Wrong format.");
			}
			else
				System.out.println("Too many words.");
		}
		else
			System.out.println(str.trim());				//if the string is only one word
	}
}
