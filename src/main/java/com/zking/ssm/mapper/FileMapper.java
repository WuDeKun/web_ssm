package com.zking.ssm.mapper;

import com.zking.ssm.model.File;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMapper {
    int insert(File record);

    File selectByPrimaryKey(String fileId);

}