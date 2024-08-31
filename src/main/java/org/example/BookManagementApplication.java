package org.example;

public class BookManagementApplication {
    private final BookService bookService= new BookServiceImplementation();
    public static void main(String[] args) {
        BookManagementApplication app = new BookManagementApplication();
//        app.bookService.saveBook(new Books(101,"Silent patient","Thriller",300));
//        app.bookService.saveBook(new Books(104,"Sharp objects","Pyschology",250));
//        app.bookService.saveBook(new Books(102,"Be careful what you wish for", "RomCom",400));
//        app.bookService.saveBook(new Books(107,"Housemaid","Pyschology",300));
//        app.bookService.getAllBooks();
//        app.bookService.deleteBook(104);
        app.bookService.getAllBooks();
//        app.bookService.updateBook(102,new Books(102,"Silent Patient","Psychological Thriller",300));

    }
}
