package lesson24.interfaces;

public class Applications {

    public static void main(String[] args) {

        Book book = new Book("master & margarita", "bulgakov");
        book.print();

        //Object objBook = (Object) book;
        //System.out.println("link type object" + objBook.toString());


        Printable book1 = new Book("java philosophy ", "b.eckel");
        book1.print();

        Journal journal = new Journal("cosmopolitan", 123);

        Printable printable = journal;
        printable.print();

        book.test();
        journal.test();

        Printable.testStatic("hello");

        System.out.println("=============");

        Presentation presentation = new Presentation("inheritance","noname","inherit OOp",20);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

        Printable printable1 = presentation;
        printable1.print();

    }
}
