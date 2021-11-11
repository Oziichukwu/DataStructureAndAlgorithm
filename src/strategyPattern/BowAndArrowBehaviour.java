package strategyPattern;

public class BowAndArrowBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "flinging a bow and arrow";
    }
}
