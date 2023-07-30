import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2= f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("-------------NEW ROUND-------------");
                if (isBeginner(f1,f2)==f1){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f2.name + " health: " + this.f2.health);

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f2.name + " health: " + this.f2.health);
                }
            }
        } else{
            System.out.println("Fighters weights are not fit for the match");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }


    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " won!");
            return true;

        } return false;
    }

    Fighter isBeginner(Fighter f1, Fighter f2){
        Random random = new Random();
        int randomNumber = random.nextInt(2)+1;
        if (randomNumber == 1){
            return f1;
        } else {
            return f2;
        }
    }
}
