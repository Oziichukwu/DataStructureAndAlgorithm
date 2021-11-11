package strategyPattern;

public class Knight extends Character{

    public Knight(){

        super();

        weaponBehaviour = new BowAndArrowBehaviour();
    }

    @Override
    void fight() {

    }
}
