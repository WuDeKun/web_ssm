package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    @Transactional
    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }
    @Transactional
    @Override
    public List<Book> queryBookPager(Book book, PageBean pageBean) {

        return bookMapper.queryBookPager(book);
    }
    @Transactional
    @Override
    public int upateByBook(Book book) {
        return bookMapper.upateByBook(book);
    }
}
