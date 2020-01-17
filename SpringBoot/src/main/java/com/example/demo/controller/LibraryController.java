package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
@RestController
public class LibraryController {

    @Resource
    private BookService bookService;

    @CrossOrigin
    @GetMapping("/api/books")
    public List<Book> queryAllBook() throws Exception {
        ObjectMapper objectMapper=new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(bookService.queryAllBook()));
        return bookService.queryAllBook();
    }

    @CrossOrigin
    @PostMapping("/api/books")
    public Book addOrUpdate(@RequestBody Book book) throws Exception {
        bookService.addOrUpdate(book);
        return book;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void delete(@RequestBody Book book) throws Exception {
        bookService.deleteById(book);
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/books")
    public List<Book> listByCategory(@PathVariable("cid") Long cid) throws Exception {
        if (null != cid && 1 != cid) {
            return bookService.listByCategory(cid);
        } else {
            return queryAllBook();
        }
    }
}
