package Chara;

/**
 * Created by stycz0007 on 11.03.16.
 */
public class SpecialAbilitiesAssigner {
    Creature creature;
    public SpecialAbilitiesAssigner(Creature user){
        this.creature=user;
    }

    public void lvlChecker(){
        if (creature.getLevel() > 1){
            classChecker();
        }
    }

    public void classChecker(){
        if (creature.getHeroClass().equals("Warrior")){
            creature.setSpecialAbility(SpecialAbilities.THUNDER_STANCE);
        }
       else if(creature.getHeroClass().equals("Mage")){
            creature.setSpecialAbility(SpecialAbilities.SHIELD_OF_KALAMIS);
        }
        else
            creature.setSpecialAbility(SpecialAbilities.SHIELD_OF_ALAZAR);
    }

    public void useSpecialAbility(){
        creature.getSpecialAbility();
    }


}
