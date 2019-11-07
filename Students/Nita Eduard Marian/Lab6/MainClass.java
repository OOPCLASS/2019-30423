import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MainClass {
	// https://www.baeldung.com/java-random-string 
	public static String randomString() { 
		  
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	    
	    return generatedString;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Character, List<Watch>> map = new HashMap<>();

		List<Watch> watchesAll = new LinkedList<>();
		List<Watch> watchesUnderAHundredRON = new LinkedList<>();
		List<Watch> watchesAboveAHundredRON = new LinkedList<>();
		
		for(int i = 0; i < 100; i++) {
			watchesAll.add(new Watch(randomString(), rand.nextDouble() * 200));
		}
		
		for(int i = 0; i < 100; i++) {
			if(watchesAll.get(i).getPrice() < 100.0) {
				watchesUnderAHundredRON.add(watchesAll.get(i));
			}else {
				watchesAboveAHundredRON.add(watchesAll.get(i));				
			}
		}
		
		for(int i = 0; i < watchesAboveAHundredRON.size(); i++) {
			System.out.println(watchesAboveAHundredRON.get(i).getBrandName() + " " + watchesAboveAHundredRON.get(i).getPrice());
		}
		
		for(char i = 'a'; i <= 'z'; i++) {
			map.put(i, new LinkedList<Watch>());
		}
		for(int i = 0; i < watchesAll.size(); i++) {
			map.get(watchesAll.get(i).getBrandName().charAt(0)).add(watchesAll.get(i));
		}

		System.out.println("###################### letters now mapped ######################");

		for(char i = 'a'; i <= 'z'; i++) {
			for(int j = 0; j < map.get(i).size(); j++) {
				System.out.print(map.get(i).get(j).getBrandName() + "," + map.get(i).get(j).getPrice() + "\t");
			}
			System.out.println();
		}
		
		
//		"a" -> {"alpha", "aro", "abc"}
//		"b" -> {}
//		
//		// all watches.. 
//		// watchesUnderAHundredRON
//		// watchesOverAHundredRON
		
		// read about java streams
		
		
	}
}
