package Chara;

/**
 * Created by stycz0007 on 14.03.16.
 */
public class EnemyGenerator {
    Creature creature;

    public void trainingEnemy(){
        creature.setName("Daln");
        creature.setHealth(100);
        creature.setMeleeAttack(5);
        creature.setMagicAttack(1);
        creature.setMeleeDeffense(5);
        creature.setMagicDeffense(2);
        creature.setLevel(1);
        creature.setHeroClass("Warrior");
    }

    public Creature getCreature(){
        return creature;
    }
}
