package Chara;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by stycz0007 on 08.03.16.
 */
public class CharacterTest {
    static Warrior warrior;
    static Mage mage;
    static Paladin paladin;
    static Enemy enemy;
    static Boss boss;
    static SpecialAbilitiesAssigner specialAbilitiesAssigner;

    @Test
    public void testIfWarriorCanBeCreated(){
        warrior = new Warrior();
        assertThat(warrior).isNotNull();
    }

    @Test
    public void testIfWarriorHas100HPAtBeginning(){
        warrior = new Warrior();
        double result = warrior.getHealth();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfWarriorHPCanBeChanged(){
        warrior = new Warrior();
        double tenHP = 10;
        warrior.setHealth(tenHP);
        double result = warrior.getHealth();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfWarriorMeleeAttackCanBeChanged(){
        warrior = new Warrior();
        double meltack = 10;
        warrior.setMeleeAttack(meltack);
        double result = warrior.getMeleeAttack();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfWarriorMagicAttackCanBeChanged(){
        warrior = new Warrior();
        double magttack = 1;
        warrior.setMagicAttack(magttack);
        double result = warrior.getMagicAttack();
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfWarriorMeleeDeffenseCanBeChanged(){
        warrior = new Warrior();
        double meldef = 4;
        warrior.setMeleeDeffense(meldef);
        double result = warrior.getMeleeDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfWarriorMagicDeffenseCanBeChanged(){
        warrior = new Warrior();
        double magdef = 4;
        warrior.setMagicDeffense(magdef);
        double result = warrior.getMagicDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfWarriorLevelCanBeChanged(){
        warrior = new Warrior();
        int lvl = 4;
        warrior.setLevel(lvl);
        double result = warrior.getLevel();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfWarriorObtainedSpecialAbilityLvl1(){
        warrior = new Warrior();
        specialAbilitiesAssigner = new SpecialAbilitiesAssigner(warrior);
        int lvl = 3;
        warrior.setLevel(3);
      //  SpecialAbilities specialAbilities =  specialAbilitiesAssigner.lvlChecker();
        //boolean result = warrior.grantingSpecialAbilities();
        //assertThat(result).isTrue();
    }

////////////////////////////////////////////////////////////////
    @Test
    public void testIfMageCanBeCreated(){
        mage = new Mage();
        assertThat(mage).isNotNull();
    }
    @Test
    public void testIfMageHas100HPAtBeginning(){
        mage = new Mage();
        double result = mage.getHealth();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfMageHPCanBeChanged(){
        mage = new Mage();
        double tenHP = 10;
        mage.setHealth(tenHP);
        double result = mage.getHealth();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfMageMeleeAttackCanBeChanged(){
        mage = new Mage();
        double mattack = 10;
        mage.setMeleeAttack(mattack);
        double result = mage.getMeleeAttack();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfMageMagicAttackCanBeChanged(){
        mage = new Mage();
        double magttack = 1;
        mage.setMagicAttack(magttack);
        double result = mage.getMagicAttack();
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfMageMeleeDeffenseCanBeChanged(){
        mage = new Mage();
        double meldef = 8;
        mage.setMeleeDeffense(meldef);
        double result = mage.getMeleeDeffense();
        double expected = 8;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfMageMagicDeffenseCanBeChanged(){
        mage = new Mage();
        double magdef = 4;
        mage.setMagicDeffense(magdef);
        double result = mage.getMagicDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfMageLevelCanBeChanged(){
        mage = new Mage();
        int lvl = 4;
        mage.setLevel(lvl);
        double result = mage.getLevel();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
//////////////////////////////////////////////////////
    @Test
    public void testIfPalladinCanBeCreated(){
        paladin = new Paladin();
        assertThat(paladin).isNotNull();
    }
    @Test
    public void testIfPaladinHas100HPAtBeginning(){
        paladin = new Paladin();
        double result = paladin.getHealth();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfPaladinHPCanBeChanged(){
        paladin = new Paladin();
        double tenHP = 10;
        paladin.setHealth(tenHP);
        double result = paladin.getHealth();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfPaladinMeleeAttackCanBeChanged(){
        paladin = new Paladin();
        double mattack = 10;
        paladin.setMeleeAttack(mattack);
        double result = paladin.getMeleeAttack();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfPaladinMagicAttackCanBeChanged(){
        paladin = new Paladin();
        double magttack = 1;
        paladin.setMagicAttack(magttack);
        double result = paladin.getMagicAttack();
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfPaladinMeleeDeffenseCanBeChanged(){
        paladin = new Paladin();
        double meldef = 4;
        paladin.setMeleeDeffense(meldef);
        double result = paladin.getMeleeDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfPaladinMagicDeffenseCanBeChanged(){
        paladin = new Paladin();
        double magdef = 4;
        paladin.setMagicDeffense(magdef);
        double result = paladin.getMagicDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfPaladinLevelCanBeChanged(){
        paladin = new Paladin();
        int lvl = 8;
        paladin.setLevel(lvl);
        double result = paladin.getLevel();
        double expected = 8;
        assertThat(result).isEqualTo(expected);
    }
/////////////////////////////////////////////////////////
    @Test
    public void testIfEnemyCanBeCreated(){
        enemy = new Enemy();
        assertThat(enemy).isNotNull();
    }
    @Test
    public void testIfEnemyHas100HPAtBeginning(){
        enemy = new Enemy();
        double result = enemy.getHealth();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfEnemyHPCanBeChanged(){
        enemy = new Enemy();
        double tenHP = 10;
        enemy.setHealth(tenHP);
        double result = enemy.getHealth();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfEnemyMeleeAttackCanBeChanged(){
        enemy = new Enemy();
        double mattack = 15;
        enemy.setMeleeAttack(mattack);
        double result = enemy.getMeleeAttack();
        double expected = 15;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfEnemyMagicAttackCanBeChanged(){
        enemy = new Enemy();
        double magttack = 1;
        enemy.setMagicAttack(magttack);
        double result = enemy.getMagicAttack();
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfEnemyMeleeDeffenseCanBeChanged(){
        enemy = new Enemy();
        double meldef = 4;
        enemy.setMeleeDeffense(meldef);
        double result = enemy.getMeleeDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfEnemyMagicDeffenseCanBeChanged(){
        enemy = new Enemy();
        double magdef = 4;
        enemy.setMagicDeffense(magdef);
        double result = enemy.getMagicDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfEnemyLevelCanBeChanged(){
        enemy = new Enemy();
        int lvl = 4;
        enemy.setLevel(lvl);
        double result = enemy.getLevel();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
////////////////////////////////////////////////////
    @Test
    public void testIfBossCanBeCreated(){
        boss = new Boss();
        assertThat(boss).isNotNull();
    }
    @Test
    public void testIfBossHas100HPAtBeginning(){
        boss = new Boss();
        double result = boss.getHealth();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossHPCanBeChanged(){
        boss = new Boss();
        double tenHP = 10;
        boss.setHealth(tenHP);
        double result = boss.getHealth();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossMeleeAttackCanBeChanged(){
        boss = new Boss();
        double mattack = 10;
        boss.setMeleeAttack(mattack);
        double result = boss.getMeleeAttack();
        double expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossMagicAttackCanBeChanged(){
        boss = new Boss();
        double magttack = 1;
        boss.setMagicAttack(magttack);
        double result = boss.getMagicAttack();
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossMeleeDeffenseCanBeChanged(){
        warrior = new Warrior();
        double meldef = 4;
        warrior.setMeleeDeffense(meldef);
        double result = warrior.getMeleeDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossMagicDeffenseCanBeChanged(){
        boss = new Boss();
        double magdef = 4;
        boss.setMagicDeffense(magdef);
        double result = boss.getMagicDeffense();
        double expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testIfBossLevelCanBeChanged(){
        boss = new Boss();
        int lvl = 9;
        boss.setLevel(lvl);
        double result = boss.getLevel();
        double expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
