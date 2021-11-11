package strategyPattern;

public class AxeBehaviour implements WeaponBehaviour{


    @Override
    public String useWeapon() {
        return "chopping with an axe";
    }
}
