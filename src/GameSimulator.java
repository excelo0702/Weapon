import CharactePackage.Assassination;
import CharactePackage.Characters;
import CharactePackage.Elite;

public class GameSimulator {
    public static void main(String[] args){
        Characters characters = new Elite();
        characters.fight();

        characters = new Assassination();
        characters.fight();

    }
}
