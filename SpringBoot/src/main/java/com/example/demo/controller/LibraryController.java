package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.example.demo.utils.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
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
        ObjectMapper objectMapper = new ObjectMapper();
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
        if (null != cid) {
            return bookService.listByCategory(cid);
        } else {
            return queryAllBook();
        }
    }

    /**
     * 上传附件
     *
     * @param file
     * @return java.lang.String
     * @author "LiXunXun"
     * @date 2020年03月17日
     */
    @CrossOrigin
    @PostMapping("api/covers")
    public String coversUpload(MultipartFile file) throws Exception {
        String folder = "D:\\xxli_GIT\\MyProject\\SpringBoot\\src\\main\\resources\\img";
        File imageFolder = new File(folder);
        File f = new File(imageFolder, StringUtils.getRandomString(6) + file.getOriginalFilename()
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            String imgURL = "http://localhost:8443/api/file/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
