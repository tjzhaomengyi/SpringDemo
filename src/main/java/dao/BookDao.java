package dao;

import entity.Book;

import java.util.List;

public interface BookDao {
        List<Book> queryAll();
}
