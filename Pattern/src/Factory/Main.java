package Factory;

import Factory.Classes.*;
import Factory.Classes.Character;

public class Main {
    public static void main(String[] args)
    {
        Character character = Factory.GameCharacter(Characters.ELF);
        System.out.println(character.getHealthPoint());
    }
}
