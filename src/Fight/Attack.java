package Fight;

import Chara.Creature;

/**
 * Created by stycz0007 on 14.03.16.
 */
public class Attack {
    BonusAdder bonusAdder = new BonusAdder();
    PenaltyAdder penaltyAdder = new PenaltyAdder();
    double damage = 0;
    double bonus = 0;
    double penalty = 0;
    public void meleeAttack(Creature creature1, Creature creature2){
         bonus = bonusAdder.randBonus();
         penalty = penaltyAdder.randPenalty();
         damage =  (creature1.getMeleeAttack() * bonus* penalty)/creature2.getMeleeDeffense();
         creature2.setHealth(creature2.getHealth() - damage);

    }

    public void magicAttack(Creature creature1, Creature creature2){
        damage = (creature1.getMagicAttack() * bonusAdder.randBonus()* penaltyAdder.randPenalty())/creature2.getMagicDeffense();
        creature2.setHealth(creature2.getHealth() - damage);

    }

}

