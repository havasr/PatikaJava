public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(2, player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the tool store!");
        System.out.println("1- Weapons");
        System.out.println("2- Armor");
        System.out.println("3- Exit");
        System.out.print("You're choice: ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Invalid entry, please try again.");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "- " + w.getName() + " <Damage: " + w.getDamage() + ", Price: " + w.getPrice() + ">");
        }
        System.out.println("Please pick a weapon: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Invalid entry, please try again.");
            selectWeaponID = input.nextInt();
        }

    }

    public void buyWeapon(){
        System.out.println("Please pick a weapon: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Invalid entry, please try again.");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponID);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficient money.");
            } else {
                //Buying the tool
                System.out.println("You have brought the weapon: " + selectedWeapon.getName());
                this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());
                System.out.println("Your new balance is: " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Weapon changed.");
            }
        }
    }

    public void printArmor() {
        System.out.println("Weapons");
    }
}
