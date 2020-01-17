package com.example.demo.service;

import com.example.demo.dao.BookMapper;
import com.example.demo.iservice.IBookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import com.example.demo.entity.Book;
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
        return bookMapper.queryAllBook();
    }

    @Override
    public Book addOrUpdate(Book book) {
        return null;
    }

    @Override
    public void deleteById(Book book) {

    }

    @Override
    public List<Book> listByCategory(Long tmCategoryId) {
        return null;
    }
}
