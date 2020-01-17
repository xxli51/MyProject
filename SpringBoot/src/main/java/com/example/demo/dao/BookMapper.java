package com.example.demo.dao;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
public interface BookMapper {

    List<Book> queryAllBook();
}
