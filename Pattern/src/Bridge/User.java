package Bridge;

public class User {
    Werewolf human;
    public User()
    {
        human = new Werewolf();
    }
    public User(Werewolf human)
    {
        this.human = human;
    }
    double damage(){return  human.damage();}
    double speed(){return  human.speed();}
    boolean fly (){return human.fly();}
    void transformToWolf(){human = new Wolf();}
    void transformToEagle(){human = new Eagle();}
    public Werewolf getHuman(){return human;}

}
