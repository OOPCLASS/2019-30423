package com.company.classes.impl;

import com.company.classes.NameInverter;

public class NameInverterImpl implements NameInverter {

    private String insertSubstring(final String[] string, final int stringPosition) {

        final int positionToBeInserted = string.length - stringPosition;

        if(positionToBeInserted >= 0) {
            if(stringPosition == 1) {
                return string[positionToBeInserted];
            }
            else if (stringPosition == 2) {
                return ", " + string[positionToBeInserted];
            }
            else {
                return " " + string[positionToBeInserted];
            }
        }
        else {
            return "";
        }
    }

    @Override
    public String invert(final String string) {
        if (string == null) {
            return null;
        }
        else {
            final String[] split = string.trim().split("\\s+");

            return  insertSubstring(split, 1) + insertSubstring(split, 2) +
                    insertSubstring(split, 4) + insertSubstring(split, 3);

        }
    }
}
