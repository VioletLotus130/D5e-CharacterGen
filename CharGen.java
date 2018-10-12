import java.io.*;
import java.math.*;
import java.util.*;


public class CharGen{
    public static void main(String[] args) {
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


        Random rn = new Random();                          //Creates random Attribute roll
        int rollAttr1 = rn.nextInt(14) + 4;
        int rollAttr2 = rn.nextInt(14) + 4;
        int rollAttr3 = rn.nextInt(14) + 4;
        System.out.print(rollAttr1 + "  " + rollAttr2 + "  " + rollAttr3 + "\n");
    
    }
} 