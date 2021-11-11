package strategyPattern;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    abstract void fight();


    public void setWeapon(WeaponBehaviour weaponBehaviour){

        this.weaponBehaviour = weaponBehaviour;
    }

    public String performFight(){

        return weaponBehaviour.toString();
    }
}
