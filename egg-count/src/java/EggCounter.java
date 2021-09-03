package java;

import textio.TextIO;

public class EggCounter {
    public static void main(String[]args){
        System.out.println("Welcome to the egg counter. I'll tell you how many gross, how many dozen, and how many extra eggs you have");
        System.out.println("How many eggs do you have?");
        int eggs = TextIO.getlnInt();//user input for number of eggs
        int gross = eggs/144;
        eggs = eggs%144;
        int dozen = eggs/12;
        eggs = eggs%12;

        System.out.println("Ok. you have "+gross +" gross, "+dozen+" dozen, and "+eggs+" individual eggs.");
    }
}
