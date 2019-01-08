package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.model.File;
import org.springframework.stereotype.Repository;

@Repository
public interface IFileService {
    int insert(File record, Book book);

    File selectByPrimaryKey(String fileId);

}