package CharactePackage;

import Horse.HorseBehaviour;
import Shield.ShieldBehaviour;
import Weapon.WeaponBehaviour;

public abstract class Characters {
    WeaponBehaviour weaponBehaviour;
    HorseBehaviour horseBehaviour;
    ShieldBehaviour shieldBehaviour;

    public abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void setHorseBehaviour(HorseBehaviour horseBehaviour) {
        this.horseBehaviour = horseBehaviour;
    }

    public void setShieldBehaviour(ShieldBehaviour shieldBehaviour) {
        this.shieldBehaviour = shieldBehaviour;
    }
}
