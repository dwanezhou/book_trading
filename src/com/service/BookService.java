package com.service;

import com.entity.Book;

import java.util.List;

/**
 * 业务逻辑层，通过持久层提供的接口获取数据，对数据进行逻辑处理
 * @author dwaneZhou
 * @create 26-3-2020\
 */
public interface BookService {

    int[] addBook(Book book);//发布书本
    boolean delBook(int bid,int uid);//用户删除书本
    List<Book> selAllBooks();//查找所有图书
    List<Book> selBookByUser(String username);//查找用户发布的图书信息，登陆时调用
    List<Book> selBookByName(String bookName);//按书名检索,模糊匹配
    Book selBookById(int bid);//按书本需要匹配
    List<Book> selBookByCategory(int cid);//按目录检索

    boolean isNew(int bid);//是否新书
    boolean isPromo(int bid);//是否特价
    boolean isSpecial(int bid);//是否畅销


}
