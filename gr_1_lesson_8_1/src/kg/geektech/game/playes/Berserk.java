package kg.geektech.game.playes;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero... heroes) {
setSavedDamage(boss.getDamage()/5);
        for (int i = 0; i <heroes.length ; i++) {
            if (this.getHealth()>0 && boss.getHealth()>0){

                boss.setHealth(boss.getHealth()-(this.getDamage()+getsavedDamage()));
                break;
            }

        }
        System.out.println("Bersek beat off the boss");
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
    public int getsavedDamage(){
        return savedDamage;
    }
}
