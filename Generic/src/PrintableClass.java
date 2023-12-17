
interface Printable{
    void  print();

    void printAnon();
}

public class PrintableClass {
    public static void main(String[] args)
    {
        Printable printable = new Printable()
        {
            @Override
            public void print()
            {
                System.out.println("print for all");
            }

            public void printAnon() {
                System.out.println("print in anon");
            }
        };
        printable.printAnon();
    }

}
