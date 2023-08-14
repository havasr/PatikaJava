public class Player {

    private int damage;
    private int health;
    private int coin;
    private String name;
    private String characterName;

    public Player(String name){
        this.name= name;
    }


    public void selectChar(){
        System.out.println("Character: Samurai \t Damage: 5 \t Health: 21 \t Money: 15");

    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
