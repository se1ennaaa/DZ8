package kg.geektech.game.playes;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero... heroes) {
int increase=10;
        for (int i = 0; i < heroes.length; i++) {
            if(this.getHealth()>0 &&heroes[i].getHealth()>0){
                heroes[i].setDamage(heroes[i].getDamage()+increase);
            }

        }
        System.out.println("magic added attack");
    }
}
