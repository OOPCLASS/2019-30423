package assignment1;

public class Invertor {
	
public static void main(String[] args) {
	
}
public static String invertName(String name)
{
	
	if(name!=null && name!="")
	{
		
		 name = name.trim().replaceAll(" +", " ");
		String name2=name;
		
		String arr[]=name2.split(" ");
	
		switch(arr.length) {
		case 1:
			break;
		case 2:
			name=arr[1]+", "+arr[0];
			break;
		case 3:
			name=arr[2]+", "+arr[1] + " "+  arr[0];
			break;
		case 4: name=arr[3]+", "+arr[2] + " " +  arr[0] + " "+ arr[1];
		    break;
	    default :
	          name= arr[arr.length-1]+", "+ arr[arr.length-2];
	    for(int i=0;i<arr.length-2 ;i++)
	    	name = name +" "+ arr[i];
	    break;
		}
	}
	
		return name;
}
}
