public class Fighter {
    String name;
    int height;
    int weight;
    int power;
    int stamina;
    int intelligence;
    double health;
    int dodge;
    int speed;
    double damage;
    int start;
    public Fighter(String name, int height, int weight, int power, int stamina, int intelligence, double health, int dodge, int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.power = power;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.health = health;
        this.dodge = dodge;
        this.speed = speed;
        this.damage = (height*0.05)+(weight*0.05)+(power*0.17)+(stamina*0.1)+(intelligence*0.12)+(speed*0.15);
    }
    public double hit(Fighter foe) {
        if (starter()){
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0.0)
            return 0;

        return foe.health - this.damage;
        } else {
            System.out.println("------------");
            System.out.println(foe.name + " => " + this.name + " " +  this.damage + " hasar vurdu.");

            if (foe.dodge()) {
                System.out.println(foe.name + " gelen hasarı savurdu.");
                return this.health;
            }

            if (foe.health - this.damage < 0.0)
                return 0;

            return this.health - this.damage;
        }

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
    public boolean starter(){
        int randomValue = (int) (Math.random()*2); //0,1
        if(randomValue==0){
            return true;
        }else{
            return false;
        }
    }
}
