package strategyPattern;

public class KnifeBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "cutting with knife";
    }
}
