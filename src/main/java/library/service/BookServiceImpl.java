package library.service;

import library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    List<Book> bookList = new ArrayList<>();
    @Override
    public List<Book> findAllBook() {
        if (bookList.isEmpty())
            return null;
        else
            return bookList;
    }
    @Override
    public Book findBookByID(long id) {
        Book book = bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
        return book;
    }
    @Override
    public Long addBook(Book b) {
        bookList.add(b);
        return null;
    }
    @Override
    public void deleteAllData() {
        bookList.clear();
    }
}