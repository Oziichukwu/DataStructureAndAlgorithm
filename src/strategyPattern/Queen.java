package strategyPattern;

public class Queen extends Character{

    public Queen(){

        super();

        weaponBehaviour = new AxeBehaviour();
    }


    @Override
    void fight() {

    }
}
