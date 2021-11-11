package strategyPattern;

public class CharacterMain {

    public static void main(String[] args) {

        Character mlam = new King();

        System.out.println("King" + mlam.performFight());

        Character mlamma = new King();

        mlamma.setWeapon(new SwordBehaviour());
        System.out.println("king says " + mlamma.performFight());

        Character nlab = new King();
        System.out.println("king" + nlab.performFight());

    }
}
