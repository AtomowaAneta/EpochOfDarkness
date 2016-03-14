package Chara;

/**
 * Created by stycz0007 on 08.03.16.
 */
public class Creature   {

     private String name = "";
     private String heroClass = "";
     private double health = 100;
     private double meleeAttack = 0;
     private double magicAttack = 0;
     private double meleeDeffense = 0;
     private double magicDeffense= 0;
     private int level = 0;
     private SpecialAbilities heroAbility;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getHeroClass(){ return heroClass;};
    public void setHeroClass(String hClass){ heroClass = hClass; }

    public double getHealth(){ return health;}
    public void setHealth(double h){
        health = h;
    }

    public double getMeleeAttack(){
        return meleeAttack;
    }
    public void setMeleeAttack(double mAttack){
        meleeAttack = mAttack;
    }

    public double getMagicAttack(){
        return magicAttack;
    }
    public void setMagicAttack(double magAttack){
        magicAttack = magAttack;
    }

    public double getMeleeDeffense(){
        return meleeDeffense;
    }
    public void setMeleeDeffense(double mDeffense){meleeDeffense = mDeffense;}

    public double getMagicDeffense(){
        return magicDeffense;
    }
    public void setMagicDeffense(double magDeffense){
        magicDeffense = magDeffense;
    }

    public int getLevel(){
        return level;
    }
    public void setLevel(int lvl){
        level = lvl;
    }

    public SpecialAbilities getSpecialAbility(){return heroAbility;}
    public void setSpecialAbility(SpecialAbilities sp){ heroAbility = sp;}






}
