public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge>0 && dodge<100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " made " + this.damage + " amount of damage.");
        if (foe.isDodge()){
            System.out.println(foe.name + " dodged the hit.");
            System.out.println("-----------------------------------");
            return health;
        }
        if (foe.health < 0) {
            return 0;
        }
        return (foe.health - this.damage);
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
