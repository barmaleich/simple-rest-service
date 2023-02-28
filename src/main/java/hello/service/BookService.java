package hello.service;


import hello.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBook();
    Book findBookByID(long id);
    Long addBook(Book b);
    void deleteAllData();
}

