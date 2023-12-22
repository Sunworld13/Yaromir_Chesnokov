package Singletone;

public class Boss {

    private static Boss instance;
    private Boss(){}
    public static Boss getInstance()
    {
        if(instance==null) instance = new Boss();
        return instance;
    }
}
