package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int dan = 8;
        System.out.println(dan + " * 1 = 8");
        System.out.println(dan + " * 2 = 16");
        System.out.println(dan + " * 3 = 24");
        System.out.println(dan + " * 4 = 32");
        System.out.println(dan + " * 5 = 40");
        System.out.println(dan + " * 6 = 48");
        System.out.println(dan + " * 7 = 56");
        System.out.println(dan + " * 8 = 64");
        System.out.println(dan + " * 9 = 72");

        System.out.println("====================");

        String s = "8 * 1 = 8\n";
        s = s + "8 * 2 = 16\n";
        s += "8 * 3 = 24\n";
        s = s + "8 * 4 = 32\n";
        s = s + "8 * 5 = 40\n";
        s = s + "8 * 6 = 48\n";
        s = s + "8 * 7 = 56\n";
        s = s + "8 * 8 = 64\n";
        s = s + "8 * 9 = 72\n";

        System.out.println(s);

    }
}