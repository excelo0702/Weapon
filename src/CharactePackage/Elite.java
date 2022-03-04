package CharactePackage;

import Horse.ArabianHorse;
import Shield.MetalShield;
import Weapon.Sword;

public class Elite extends Characters {

    public Elite(){
        setWeaponBehaviour(new Sword());
        setHorseBehaviour(new ArabianHorse());
        setShieldBehaviour(new MetalShield());
    }

    @Override
    public void fight() {
        System.out.println("I am an elite fighter. I fight classy");
    }
}
