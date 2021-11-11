package strategyPattern;

public class Troll extends Character{

    public Troll(){

        super();

        weaponBehaviour = new SwordBehaviour();
    }

    @Override
    void fight() {

    }
}
