package MPE2.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex02 {
    //main method begin
    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("What is the input string? ");
        String name = in.nextLine();

        //Counter
        int count = 0;
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != ' ')
                count++;
        }

        //Output String
        String outputString = name + " has " + count + " characters.";
        //Output
        System.out.println(outputString);
    }
    //main method end
}
//class end
