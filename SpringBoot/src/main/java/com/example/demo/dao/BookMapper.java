package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
public interface BookMapper {

    /**
     * 查询书列表
     *
     * @param
     * @return java.util.List<com.example.demo.entity.Book>
     * @author "LiXunXun"
     * @date 2020年03月17日
     */
    List<Book> queryAllBook(@Param("tmCategoryId") Long tmCategoryId);

    /**
     * 更新书信息
     *
     * @param book
     * @return int
     * @author "LiXunXun"
     * @date 2020年03月17日
     */
    int updateBooks(Book book);

    /**
     * 新增书信息
     *
     * @param book
     * @return int
     * @author "LiXunXun"
     * @date 2020年03月17日
     */
    int insertBooks(Book book);

    /**
     * 删除书信
     *
     * @param tmBookId
     * @return int
     * @author "LiXunXun"
     * @date 2020年03月17日
     */
    int deleteBookById(@Param("tmBookId") Long tmBookId);
}
