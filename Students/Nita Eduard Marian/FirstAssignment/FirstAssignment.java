public class FirstAssignment {
	public static void main(String[] args) {
		System.out.println(nameInverter(null));
		System.out.println(nameInverter(""));
		System.out.println(nameInverter("SingleWord"));
		System.out.println(nameInverter("FirstName LastName"));
		System.out.println(nameInverter("   SingleWord    "));
		System.out.println(nameInverter("   FirstName   LastName   "));
		System.out.println(nameInverter("Mr. FirstName LastName"));
		System.out.println(nameInverter("Ms. FirstName LastName"));
		System.out.println(nameInverter("Mr. Phd. FirstName LastName"));
		System.out.println(nameInverter("Ms. Phd. FirstName LastName"));
		System.out.println(nameInverter("Phd. Ms. FirstName LastName")); //Phd. and Ms. switched
		System.out.println(nameInverter("One Two Three Four Five")); // More than 4 strings
	} 
	public static String nameInverter(String inputString)
	{

		if(inputString == null)
		{
			return null;			
		}

		String[] tempArray = inputString.trim().split(" +");

		if(tempArray.length > 4)
		{
			System.out.println("Number of words exceeds 4");
		}
		else {
			switch(tempArray.length) {
				case 4: 
					if((tempArray[0].equals("Mr.") || tempArray[0].equals("Ms.")) && tempArray[1].equals("Phd."))
					{
							return tempArray[3] + ", " + tempArray[2] + " " + tempArray[0] + " " + tempArray[1];
					}
					break;
				case 3:
					if(tempArray[0].equals("Mr.") || tempArray[0].equals("Ms."))
					{
						return tempArray[2] + ", " + tempArray[1] + " " + tempArray[0];
					}
					break;
				case 2:
					return tempArray[1] + ", " + tempArray[0];
				case 1:
					return tempArray[0];
				case 0:
					return "";
				default: 
					break;
			}
		}
		return "invalid input";
	}
}
