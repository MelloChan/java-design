package exam01;

import exam01.beheave.*;
import exam01.character.*;
import exam01.character.Character;

/**
 * 具体运行客户端
 */
public class Main {

    public static void main(String[] args) {
        Character character=new King();
        WeaponBehavior weaponBehavior=new SwordBehavior();
        character.setWeapon(weaponBehavior);
        character.fight();
        System.out.println("国王更换武器");
        character.setWeapon(new BowAndArrowBehavior());
        character.fight();

        character=new Queen();
        weaponBehavior=new BowAndArrowBehavior();
        character.setWeapon(weaponBehavior);
        character.fight();

        character=new Knight();
        weaponBehavior=new AxeBehavior();
        character.setWeapon(weaponBehavior);
        character.fight();

        character=new Troll();
        weaponBehavior=new KnifeBehavior();
        character.setWeapon(weaponBehavior);
        character.fight();
    }
}
