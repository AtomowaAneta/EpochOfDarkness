package Game;
import java.util.Scanner;
import java.util.Timer;

import Chara.*;
import Places.Land;
import Fight.*;

/**
 * Created by stycz0007 on 08.03.16.
 */




public class MainGame {

    static Scanner scan = new Scanner(System.in);
    static Creature userCharacter;
    static Land trainingLand;
    static Enemy enemy;
    static Fight fight = new Fight();


    public static void chooseName(){
        System.out.println("Choose your name: ");
        userCharacter.setName(scan.nextLine());
    }

    public static Creature chooseCharacter(){
        System.out.println("warrior , mage , paladin");
        System.out.println("Choose your race: ");


        switch (scan.nextLine()){
            case "warrior": return new Warrior();


            case "mage": return new Mage();


            case "paladin" : return new Paladin();


            default: System.out.println("zjebales");
        }

    return new Creature();
    }


    public static void main(String[] args) {
        System.out.println("Welcome in Epoch of Darkness game!");
        userCharacter = chooseCharacter();
        chooseName();
        System.out.println(userCharacter.getName() + " Prepare for journey");
        System.out.println("Train enemy:");
        enemy = new Enemy();
        System.out.println(enemy.getName());
        fight.beginFight(userCharacter, enemy);
    }
}
