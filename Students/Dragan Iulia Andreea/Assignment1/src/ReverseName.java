public class ReverseName {
	public static void main(String[] args) {
		System.out.println(reverseName(null));
		System.out.println(reverseName(""));
		System.out.println(reverseName("SingleWord"));
		System.out.println(reverseName("FirstName LastName"));
		System.out.println(reverseName("   SingleWord   "));
		System.out.println(reverseName("   FirstName LastName   "));
		System.out.println(reverseName("Mr. FirstName LastName"));
		System.out.println(reverseName("Ms. Phd. FirstName LastName"));
	}
	
	public static String reverseName(String str) {
		if (str == null) return null;
		if(str == "") return "";
		
		str = str.trim();
		String[] arrStr = str.split(" ",0);
		int len = arrStr.length;
		
		if(len == 1) return str;
		
		String lastName = arrStr[len - 1];
		String firstName = arrStr[len - 2];
		String title = "";
		
		for(int i = 0; i < len-2; i++) {
			title = title + " " + arrStr[i];
		}
		return(lastName + ", " +  firstName + title);
	}
}
