
public class NmaeInverter {
	
	public static void main(final String[] args) {
		String invertedName;
		invertedName=inverter("    Viorel Popescu    ");
		System.out.println(invertedName);
		invertedName=inverter("");
		System.out.println(invertedName);
		invertedName=inverter("Gion");
		System.out.println(invertedName);
		invertedName=inverter("  Gion   ");
		System.out.println(invertedName);
		invertedName=inverter("Bogdan David");
		System.out.println(invertedName);
		invertedName=inverter("Mr. Alex Ardelean");
		System.out.println(invertedName);
		invertedName=inverter("Mrs. Phd. Marius Joldos");
		System.out.println(invertedName);
	}
	
	public static String inverter(String name) {
		String copy;
		String invertedName="";
		copy=name.trim();
		String partsOfCopy[]=copy.split(" ");
		int i;
		for(i=partsOfCopy.length -1;i>=0;i--) {
			if(i==partsOfCopy.length -1)
			{
				invertedName=invertedName+partsOfCopy[i];
				if(i!=0)
					invertedName+=", ";
			}
			else
				if(i==1 && partsOfCopy[i]=="Phd.")
				{
					invertedName+=partsOfCopy[0];
					invertedName+=" ";
					invertedName+=partsOfCopy[i];
					i=-1;
				}
				else
				{
					invertedName+=partsOfCopy[i];
					invertedName+=" ";
				}
		}
		return invertedName;
	}
}
