package com.example.demo.iservice;

import com.example.demo.entity.Book;
import java.util.List;

public interface IBookService {

    List<Book> queryAllBook();

    int addOrUpdate(Book book);

    int deleteById(Book book);

    List<Book> listByCategory(Long tmCategoryId);
}
