public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfProtection("Invulnerable");
        System.out.println("Boss info: health: " + boss.getHealth() + ", damage: " + boss.getDamage() + ", type of protection: " + boss.getTypeOfProtection());

        Hero[] heroes = createHeroes();
        for (Hero heroesAll : heroes) {
            System.out.println("Health: " + heroesAll.getHealth() + ", Damage " + heroesAll.getDamage()+ ", Type of Protection: " + heroesAll.getSuperpowers());
        }
    }

    public static Hero[] createHeroes(){
        Hero physical = new Hero(260, 20 , "Physical");
        Hero magical = new Hero(250, 15, "Magical");
        Hero kinetic = new Hero(270, 10);
        Hero[] heroes = {physical, magical, kinetic};
        return heroes;
    }
}