package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookService {

    int insert(Book record);

   List<Book> queryBookPager(Book book,PageBean pageBean);

   int upateByBook(Book book);
}