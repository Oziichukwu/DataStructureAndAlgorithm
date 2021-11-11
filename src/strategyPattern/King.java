package strategyPattern;

public class King extends Character {

    public King(){

        super();

        weaponBehaviour = new KnifeBehaviour();
    }

    @Override
    void fight() {

    }
}
