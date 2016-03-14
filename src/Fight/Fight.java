package Fight;

import Chara.Creature;

import java.util.Scanner;

/**
 * Created by stycz0007 on 14.03.16.
 */
public class Fight {
    static
    static Scanner scanner;
    static Attack attack;
    static Deffend deffend;
    public void beginFight(Creature user, Creature enemy){
        System.out.println(user.getName() + " User turn");
        System.out.println("What You want to do?");
        System.out.printf("1. Use melee attack 2. Use magic attack");
        System.out.printf("2. Deffend 4. Magic Deffend");
        switch (scanner.nextInt()){
            case 1: attack.meleeAttack(user, enemy);
                    break;
            case 2: attack.magicAttack(user, enemy);
                break;
            case 3: deffend.meleeDeffend();
                break;
            case 4: deffend.magicDeffend();
                default: System.out.println("Wrong choice. Turn lost");
        }
    }
}
