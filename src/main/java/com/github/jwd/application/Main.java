package com.github.jwd.application;

import com.github.jwd.rpncalc.RPNCalc;

public class Main {

    public static void main(String[] args) {

        String input = "2+2+3*5-((5-4)*5)";

        try {
            System.out.println("Calc result: " + RPNCalc.calculate(input));
        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
