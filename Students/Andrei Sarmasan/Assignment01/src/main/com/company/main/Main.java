package com.company.main;

import com.company.classes.NameInverter;
import com.company.classes.impl.NameInverterImpl;

public class Main {

    public static void main(String[] args) {

        final NameInverter nameInverter = new NameInverterImpl();
        System.out.println(nameInverter.invert("   Mr.    Phd.  FirstName     SecondName   "));

    }
}
