public class Name {

    /**
     * Inverts a name: First Last  ->  Last, First
     * Single      ->  Single
     * Removes Spaces around and in between the names
     * Takes in consideration the titles also
     *
     * @param CustomerName
     * @return
     */
    public static String invert(String CustomerName) {
        if (CustomerName == null) {
            return null;
        }
        CustomerName = CustomerName.trim().replaceAll(" +", " ");
        String[] splitName = CustomerName.split(" ");
        String Title = "";
        String FirstName = "";
        for (int i = 0; i < splitName.length - 1; i++) {
            if (splitName[i].charAt(splitName[i].length() - 1) == '.')
                Title += splitName[i] + " ";
            else
                FirstName += splitName[i] + " ";
        }
        if (splitName.length == 1) {
            return splitName[splitName.length - 1];
        }
        String InvertedName = splitName[splitName.length - 1] + ", " + FirstName + " " + Title;
        return InvertedName.trim().replaceAll(" +", " ");
    }

    public static void main(String[] args) {

    }
}
