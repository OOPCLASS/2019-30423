package lab1;

public class Invert {
	public static void main(String[] args) {
		System.out.println(nameSwitch("null"));
		System.out.println(nameSwitch(""));
		System.out.println(nameSwitch("Adina"));
		System.out.println(nameSwitch("Adina    Misaras"));
		System.out.println(nameSwitch("Mrs. Adina Misaras"));
		System.out.println(nameSwitch("Mrs.       Phd.  Adina Misaras"));
		System.out.println(nameSwitch("  Adina "));
		System.out.println(nameSwitch("             Mrs Adina"));
	}

	public static String nameSwitch(String name) {
		String title1[]= {"Mr.","Mrs"};
		String title2= "Phd.";
		
		if(name==null)
			return null;
		if(name=="")
			return "";
		name=name.trim().replaceAll(" +"," ");
		String nameInvertor[] = name.split(" ");
		
		
		if(nameInvertor.length==1)
			return name;
	
			
			
			if(nameInvertor.length==2)
			{
			String correctPlace1 = nameInvertor[1] + ", " + nameInvertor[0];
			return correctPlace1;
			}
		
			
			if(nameInvertor.length==3)
			{
				
				if(nameInvertor[0].contains(title1[0]) || nameInvertor[0].contains(title1[1]))
				{
				
					String correctPlace2=nameInvertor[2]+ ", "+ nameInvertor[1]+" "+nameInvertor[0];
					return correctPlace2;
				}
				
			}
			
			if(nameInvertor.length==4)
			{
				if((nameInvertor[0].contains(title1[0]) && nameInvertor[1].contains(title2)) || (nameInvertor[0].contains(title1[1]) && nameInvertor[1].contains(title2)))
				{
					String correctPlace3=nameInvertor[3]+ ", "+ nameInvertor[2]+" "+ nameInvertor[0]+" "+nameInvertor[1];
					return correctPlace3;
				}
				
			}
			
			
			
		return null;
		
	}
}
