import  java.util.*;
import  java.lang.StringBuilder;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        name=invertName(name);
        System.out.println(name);
    }

    public static String invertName (String name ) {
        if(name == null)
            return  null;

        String []namesAndTitles=name.trim().split("\\s+");
        String  invertedName="";

        if(namesAndTitles.length >= 2 ){
            invertedName= namesAndTitles[namesAndTitles.length-1] + ", " + namesAndTitles[namesAndTitles.length-2];
        } else if (namesAndTitles.length == 1){
            invertedName=namesAndTitles[0];
        }
        // Add the titles at the and of the name
        for(int i=0; i < namesAndTitles.length-2; i++)
        {
            invertedName = invertedName + " " + namesAndTitles[i];
        }

        return  invertedName;
    }
}
