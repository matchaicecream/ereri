/*
Write a program that prompts the user for a month and 
day and then prints the season, as determined by this algorithm.


*/

import java.util.Scanner;

import jdk.internal.jshell.tool.resources.l10n;

public class Chachamaru{
    public static void main(String[] args)
    {
        Scanner month = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        String season = " ";
        System.out.println("Enter a month (IN NUMBERS): ");
        int enteredMonth = month.nextInt();
        System.out.println("Enter a day (IN NUMBERS! GOD, I HATE OSU): ");
        int enteredDay = day.nextInt();
        if(enteredMonth < 0 || enteredMonth > 12)
        {
            System.out.println("Whatcha tryin' to do ");
            if(enteredDay > 31 || enteredDay < 0 )
            {
                System.out.println("Tryin' to pull a fast one aren't cha??! \nJust do the dang program");
            }
        } 
        if(enteredMonth < 3 && enteredMonth > 0){
            season = "Winter";
            if(enteredMonth%3==0 && enteredDay >= 21)
            {
                season = "Spring";
            }
            System.out.println("The season is: " + season );
        }
        else if(enteredMonth < 7 && enteredMonth > 3) 
        {
            season = "Spring";
            if(enteredMonth%3==0 && enteredDay >= 21)
            {
                season = "Summer";
            }
            System.out.println("The season is: " + season );
        }
        else if(enteredMonth > 6 && enteredMonth < 10)
        {
            season = "Summer";
            if(enteredMonth%3==0 && enteredDay >= 21)
            {
                season = "Fall";
            }
            System.out.println("The season is: " + season );
        }
        else if(enteredMonth > 9 && enteredMonth < 13)
        {
            season = "Fall";
            if(enteredMonth%3==0 && enteredDay >= 21)
            {
                season = "Winter";
            }
            System.out.println("The season is: " + season );
        }
        else
        {
            System.out.println("Invalid input");
        }

        
        //System.out.println("The season is: " + season );

        month.close();
        day.close();
    }

}
