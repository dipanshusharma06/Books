package org.example;

import java.awt.print.Book;

public interface BookService {
    void saveBook(Books books);
    void getBook(int bookNo);
    void getAllBooks();
    void deleteBook(int bookNo);
    void updateBook(int bookNo, Books books);
}
