import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String characterName;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
    }


    public void selectChar() {
        GameCharacter[] characterList = {new Samurai(), new Knight(), new Archer()};

        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < characterList.length; i++) {
            System.out.println(i + 1 + "- " + characterList[i].getName() + " - Damage: " + characterList[i].getDamage()
                    + " Health: " + characterList[i].getHealth() + " Money: " + characterList[i].getMoney());
        }
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }

        System.out.println("Your character is " + this.characterName + "!");
    }

    public void selectLocation() {
        Location location = null;
        System.out.println("-----------------------------------------------------------");
        Location[] locationList = {new SafeHouse(this), new ToolStore(this)};
        System.out.println("Locations: ");
        for (Location loc : locationList) {
            System.out.println(loc.getId() + " - " + loc.getName());
        }
        System.out.println("Please select the location you want to go to.");

        int selectLocation = input.nextInt();
        for (Location loc2 : locationList) {
            if (selectLocation == loc2.getId()) {
                location = loc2;
            }
        }

        location.onLocation();
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharacterName(gameCharacter.getName());
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
