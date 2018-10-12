import java.io.*;
import java.math.*;
import java.util.*;


public class CharGen
{
    public static void main(String[] args) 
    {
        Console console = System.console();
        /*
        Name !!DONE
        Character !!DONE
        Sex !!DONE
        Race !!DONE
        Age !!DONE
        Alignment !!DONE
        [Class] 
        [Level]
        [Background] !NO!
        Attributes !
        */

        // Get Player Name
        String playerName = console.readLine("Enter Player name: ");
        // Get Character Name
        String characterName = console.readLine("Enter your Character's name: ");
        // Get Character sex
        String characterSex = console.readLine("Enter your Character's sex: ");        
        // Get Character Race
        String characterRace = console.readLine("Enter your Character's Race: ");
        // Get Character Age
        String characterAge = console.readLine("Enter your Character's Age: ");
        int characterAgeINT = Integer.parseInt(characterAge);
        // Get Character Alignment
        console.printf("Is your character Lawful, Neutral, or Chaotic?\n");
        String characterAlignment1 = console.readLine("Enter First Alignment: ");
        console.printf("Is your character Good, Neutral, or Evil?\n");
        String characterAlignment2 = console.readLine("Enter Second Alignment: ");

        // Get Character Class
       // console.printf("CLASS\n\n\n\n");



        //
        int attributeStr, attributeDex, attributeCon, attributeInt, attributeWis, attributeCha;
        int choiceAttr;

        Random rn = new Random();                          //Creates random Attribute roll
        int rollAttr1 = rn.nextInt(14) + 4;
        int rollAttr2 = rn.nextInt(14) + 4;
        int rollAttr3 = rn.nextInt(14) + 4;
        int rollAttr4 = rn.nextInt(14) + 4;
        int rollAttr5 = rn.nextInt(14) + 4;
        int rollAttr6 = rn.nextInt(14) + 4;
        int rollAttr7 = rn.nextInt(14) + 4;
        System.out.print("\nRoll One:     " + rollAttr1);
        System.out.print("\nRoll Two:     " + rollAttr2);
        System.out.print("\nRoll Three    " + rollAttr3);
        System.out.print("\nRoll Four     " + rollAttr4);
        System.out.print("\nRoll Five     " + rollAttr5);
        System.out.print("\nRoll Six      " + rollAttr6);
        System.out.print("\nRoll Seven    " + rollAttr7);
        System.out.print("\n\nEnter your selection using the number corresponding to the number of the roll for each of the following.");
        System.out.print("\nStrength Entry: ");
        if (choiceAttr == 1)
        {
            attributeStr = rollAttr1;
            rollAttr1 = 0;
        }
        else if (choiceAttr == 2)
        {
            attributeStr = rollAttr2;
            rollAttr2 = 0;
        }
        else if (choiceAttr == 3)
        {
            attributeStr = rollAttr3;
            rollAttr3 = 0;
        }
        else if (choiceAttr == 4)
        {
            attributeStr = rollAttr4;
            rollAttr4 = 0;
        }
        else if (choiceAttr == 5)
        {
            attributeStr = rollAttr5;
            rollAttr5 = 0;
        }
        else if (choiceAttr == 6)
        {
            attributeStr = rollAttr6;
            rollAttr6 = 0;
        }
        else if (choiceAttr == 7)
        {
            attributeStr = rollAttr7;
            rollAttr7 = 0;
        }                              //I'm stopping here. I think this is the shortest way to set up this part. If you have a better way such as a loop let me know.
    }
} 