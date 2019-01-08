package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.mapper.FileMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FileServiceImpl implements IFileService {

    @Autowired
    private FileMapper fileMapper;
    @Autowired
    private BookMapper bookMapper;

    @Transactional
    @Override
    public int insert(File record, Book book) {
        fileMapper.insert(record);
        bookMapper.upateByBook(book);
        return 1;
    }

    @Override
    public File selectByPrimaryKey(String fileId) {
        return fileMapper.selectByPrimaryKey(fileId);
    }
}
