package Fight;

import Chara.Creature;
import Chara.SpecialAbilities;
import Chara.SpecialAbilitiesAssigner;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by stycz0007 on 14.03.16.
 */
public class Fight {

    Scanner scanner = new Scanner(System.in);
    Attack attack = new Attack();
    Deffend deffend = new Deffend();
    SpecialAbilitiesAssigner specialAbilitiesAssigner;
    Random rand = new Random();

    public void beginFight(Creature user, Creature enemy) {
        while (user.getHealth() >= 0 || enemy.getHealth() >= 0) {
            System.out.println(user.getName() + " User turn");
            System.out.println("What You want to do?");
            System.out.println("1. Use melee attack 2. Use magic attack");
            System.out.println("3. Melee Deffend 4. Magic Deffend 5.Request peace");
            if (user.getSpecialAbility() != null) {
                System.out.println("6. " + user.getSpecialAbility());

            }
            switch (scanner.nextInt()) {
                case 1:
                    attack.meleeAttack(user, enemy);
                    break;
                case 2:
                    attack.magicAttack(user, enemy);
                    break;
                case 3:
                    deffend.meleeDeffend();
                    break;
                case 4:
                    deffend.magicDeffend();
                    break;
                case 5:
                    specialAbilitiesAssigner.useSpecialAbility();
                    break;
                case 6:
                    specialAbilitiesAssigner.useSpecialAbility();
                    break;
                default:
                    System.out.println("Wrong choice. Turn lost");

            }
            System.out.println(user.getHealth());
            System.out.println(enemy.getName() + " Turn");
            switch (1 + rand.nextInt(4)) {
                case 1:
                    attack.meleeAttack(enemy, user);
                    break;
                case 2:
                    attack.magicAttack(enemy, user);
                    break;
                case 3:
                    deffend.meleeDeffend();
                    break;
                case 4:
                    deffend.magicDeffend();
                    break;

                default:
                    System.out.println("Wrong choice. Turn lost");

            }
            System.out.println(enemy.getHealth());
            if (user.getHealth() <= 0){
                System.out.println(enemy.getName()+" WON!");
                System.exit(0);
            }
             if(enemy.getHealth() <= 0) {
                 System.out.println(user.getName() + " WON!");
                 System.exit(0);
             }
        }
    }
}

