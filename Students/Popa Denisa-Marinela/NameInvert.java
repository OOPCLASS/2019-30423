public class NameInvert {
    public static void main(String[] args) {

        System.out.println(invertName(null));
        System.out.println(invertName(""));
        System.out.println(invertName("SingleWord"));
        System.out.println(invertName("FirstName LastName"));
        System.out.println(invertName("   SingleWord   "));
        System.out.println(invertName("   FirstName   LastName   "));
        System.out.println(invertName("Mr. FirstName LastName"));
        System.out.println(invertName("Mrs. FirstName LastName"));
        System.out.println(invertName("Mr. Phd. FirstName LastName"));
        System.out.println(invertName("Mr. Phd. FirstName LastName"));
    }

       /* System.out.println(new String("      hello     there   ").trim().replaceAll("\\s{2,}", " "));*/
       public static  String invertName(String str){
           if(str == null) return null;
           if(str == " ") return " ";
           str=str.trim().replaceAll("\\s{2,}"," ");
           String[] arrStrings= str.split(" ");
           String prefix= new String();
           int i =0;
           while(i!=arrStrings.length) {
               if (arrStrings[i].endsWith("."))
                   prefix = prefix.concat(arrStrings[i] + " ");
               i++;
           }

          if(arrStrings.length==1) return str;
          else
               if(arrStrings.length<=2){
                   return arrStrings[arrStrings.length-1]+","+ arrStrings[arrStrings.length-2];
               }
               else  return arrStrings[arrStrings.length-1]+","+ arrStrings[arrStrings.length-2]+" "+prefix;


       }

}