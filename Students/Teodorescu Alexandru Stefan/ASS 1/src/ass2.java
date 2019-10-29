public class ass2 {
		
	public static void main(String args[]) { 
        
		String fullName = "   Phd. Eng. Alexandru Teodorescu   ";
		Inverter(fullName);
	}
	public static String Inverter(String fullName) {
		
		String finalName = "";
		
		if(fullName == null) {
			
			finalName = null;
			return finalName;
		}
		
		if(fullName == "") {

			return finalName;
		}
		
		fullName = fullName.trim();
		String names[] = fullName.split(" ");
		
		int noOfNames = names.length;
		
		int i = noOfNames - 1;
		finalName += names[i];
		finalName += ", ";
		i--;
		finalName += names[i];
		
		int j;
		
		for(j = 0; j < i ; j++) {
			
			finalName += " ";
			finalName += names[j];
		}
		System.out.println(finalName);
		return finalName;
	}
}
