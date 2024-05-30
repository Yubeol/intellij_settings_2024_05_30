package org.example;

public class prac6{
    public static void main(String[] args) {
        int i = 1;
        int dan = 8;
        while(i <= 1000){
            System.out.println(dan);
            i++;
        }
        System.out.println(i);
            while(i <= -500){
                System.out.println(i);
                i -= i;
            }
    }
}
