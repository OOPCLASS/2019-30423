
public class NameInverter {
	
	public static void main(String[] args) {
		System.out.println(Invert(" Mr. Phd. Ing. Denis Robert Flueran"));
		System.out.println(Invert(" Mr.      Hatz      John"));
		System.out.println(Invert("          Denis         Flueran"));
		System.out.println(Invert("           Denisacke     "));
		System.out.println(Invert(null));
		System.out.println("");
	}
	public static String Invert(String fullName) {
		if(fullName == null)
			return null;
		if(fullName == "")
			return "";
		String wordString[] = fullName.split(" ");
		String NameWithTitles = new String();
		String titles = new String();
		int NumberOfWordsCount = 0;
		boolean MultipleWords = false;
		for(String word : wordString) {
			NumberOfWordsCount++;
			if(word.contains("."))
				titles = titles.concat(word + " ");
		}
		NameWithTitles = NameWithTitles.concat(wordString[NumberOfWordsCount - 1] + ", ");
		for(int i = 0; i < NumberOfWordsCount - 1; i++)
			if(wordString[i].length() != 0 && !wordString[i].contains(".")) {
				NameWithTitles = NameWithTitles.concat(wordString[i] + " ");
				MultipleWords = true;
			}
		if(MultipleWords == false)
			NameWithTitles = NameWithTitles.replace(",", "");
		
		NameWithTitles = NameWithTitles.concat(titles); 
		return NameWithTitles.substring(0, NameWithTitles.length() - 1); //to get rid of the last space
	}
}
