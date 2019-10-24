package assignment_01;

import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                null,
                "",
                "SingleWord",
                "FirstName LastName",
                " SingleWord ",
                " FirstName LastName ",
                "Mr. FirstName LastName",
                "Mr. Phd. FirstName LastName",
                "Dr. Joe",
                "Dr.         Phd. Jack",
                "Jack John Bill",
                "Dr. Phd. Jack John Bill",
                "Dr. Phd."
        );
        for (String name : names) {
            System.out.println("\"" + name + "\" inverted is: \"" + invertName(name) + "\"");

        }
    }

    /**
     * Inverts a given name, such that:
     * null -> null
     * SingleName -> SingleName
     * FirstName LastName -> LastName, FirstName
     * Title1. Title2. FirstName -> Title1. Title2. FirstName
     * Title1. Title2. FirstName LastName -> LastName, FirstName Title1. Title2.
     * Title1. Title2. FirstName MiddleName1 MiddleName2 LastName -> LastName, FirstName MiddleName1 MiddleName2 Title1. Title2.
     *
     * @param name The name to be inverted
     * @return The inverted name
     */
    public static String invertName(String name) {
        if (name == null) {
            return null;
        }

        int firstNameIndex = -1, lastNameIndex = -1;
        StringBuilder title = new StringBuilder(), invertedName = new StringBuilder();

        name = name.trim().replaceAll(" +", " ");
        String[] words = name.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(".")) {
                if (title.length() != 0) {
                    title.append(" ");
                }
                title.append(words[i]);
            } else {
                if (firstNameIndex == -1) {
                    firstNameIndex = lastNameIndex = i;
                } else {
                    lastNameIndex = i;
                }
            }
        }
        if (lastNameIndex <= firstNameIndex) {
            return name;
        }

        invertedName.append(words[lastNameIndex]).append(",");
        for (int i = firstNameIndex; i < lastNameIndex; i++) {
            invertedName.append(" ").append(words[i]);
        }

        if (title.length() != 0) {
            invertedName.append(" ").append(title);
        }
        return invertedName.toString();
    }
}
