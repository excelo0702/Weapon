package CharactePackage;

import Horse.WildHorse;
import Shield.WoodenShield;
import Weapon.BowAndArrow;

public class Archers extends Characters{

    public Archers(){
        setWeaponBehaviour(new BowAndArrow());
        setHorseBehaviour(new WildHorse());
        setShieldBehaviour(new WoodenShield());
    }

    @Override
    public void fight() {
        System.out.println("I am an archer!! I do attack from far");
    }
}
