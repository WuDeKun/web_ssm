package com.zking.ssm.mapper;

import com.zking.ssm.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {

    int insert(Book record);

   List<Book> queryBookPager(Book book);

   int upateByBook(Book book);
}