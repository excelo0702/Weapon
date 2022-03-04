package CharactePackage;

import Horse.ArabianHorse;
import Shield.MetalShield;
import Weapon.Knife;

public class Assassination extends Characters {
    public Assassination() {
        setWeaponBehaviour(new Knife());
        setHorseBehaviour(new ArabianHorse());
        setShieldBehaviour(new MetalShield());
    }

    @Override
    public void fight() {
        System.out.println("I am an Assassin. I assassinate thugs");
    }
}
