package com.example.demo.service;

import com.example.demo.dao.BookMapper;
import com.example.demo.entity.Book;
import com.example.demo.iservice.IBookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
@Service
@Transactional
public class BookService implements IBookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook(null);
    }

    @Override
    public int addOrUpdate(Book book) {
        if (book.getTmBookId() == null) {
            return bookMapper.insertBooks(book);
        } else {
            return bookMapper.updateBooks(book);
        }
    }

    @Override
    public int deleteById(Book book) {
        return bookMapper.deleteBookById(book.getTmBookId());
    }

    @Override
    public List<Book> listByCategory(Long tmCategoryId) {
        return bookMapper.queryAllBook(tmCategoryId);
    }
}
