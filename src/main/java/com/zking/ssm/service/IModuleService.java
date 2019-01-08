package com.zking.ssm.service;

import com.zking.ssm.model.Module;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface IModuleService {
    int insert(Module record);
    int insertSelective(Module record);
    List<Module> queryModuleTree(Module module);
}