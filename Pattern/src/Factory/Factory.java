package Factory;
import Factory.Classes.*;
import Factory.Classes.Character;

public class Factory{
    public static Character GameCharacter(Characters characters)
    {
        switch (characters)
        {
            case DWARF:
                return new Dwarf();
            case ELF:
                return new Elf();
            case HUMAN:
                return new Human();
            case ORC:
                return new Orc();
            default: throw new RuntimeException();
        }
    }
}
