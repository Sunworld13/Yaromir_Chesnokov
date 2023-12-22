package Bridge;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getHuman() instanceof Werewolf);
        user.transformToWolf();
        System.out.println(user.getHuman() instanceof Wolf);
        user.transformToEagle();
        System.out.println(user.getHuman() instanceof Wolf);

    }
}
