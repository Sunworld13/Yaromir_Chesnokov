import java.lang.String;

import java.util.Date;

public class Reader {
    String name;
    String secondname;
    String surname;
    int ticketNumber;
    String faculty;
    Date birthday;
    int phoneNumber;

    public Reader(String name,String secondname,String surname){
        this.name=name;
        this.secondname=secondname;
        this.surname=surname;
    }
    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(int value) {
        System.out.println(name + " " + secondname + " " + surname + " взял " + value + " книг(и)");
        System.out.println(" ");
    }

    public void takeBook(String... value) {
        System.out.println(name + " " + secondname + " " + surname + " взял книги: ");
        for (String a : value)
            System.out.print(a + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void takeBook(Book... value) {
        System.out.println(name + " " + secondname + " " + surname + " взял книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(int value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул " + value + " книг(и)");
        System.out.println(" ");
    }

    public void returnBook(String... value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул книги: ");
        for (String a : value)
            System.out.print(a + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void returnBook(Book... value) {
        System.out.println(name + " " + secondname + " " + surname + " вернул книги: ");
        for (Book a : value)
            System.out.print("'" + a.bookname + "' " + a.authorName + ", ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Reader[] readers=new Reader[6];
        readers[0]=new Reader("Фродо","Бэггинс","Дродович");
        readers[1]=new Reader("Леголас","Синдар","Трандуилович");
        readers[2]=new Reader("Арагорн","Дунедайн","Араторнович");
        readers[3]=new Reader("Гимли","Длиннобород","Глоинович");
        readers[4]=new Reader("Гендальф","Белый","Майарович") ;
        readers[5]=new Reader("Торин", "Дубощит","Траинович");

        Book booking=new Book("Как быть евреем, татарином и поляком одновременно","Я.М.Чесноков");
        Book booking1=new Book("Первый скил и третий скил! Искусство войны","А.А.Нечайкин");
        Book booking2=new Book("Американский пирог или начало отношений","Д.А.Асташкин");
        Book booking3=new Book("Чеканься и грызись в выпускной день", "Моторный бабник");
        readers[0].returnBook(booking);
        readers[1].returnBook(2);
        readers[2].takeBook(5);
        readers[4].takeBook("Безжизненые формы жизни");
        readers[3].takeBook(booking1,booking2);
        readers[5].takeBook(booking3);
    }

}