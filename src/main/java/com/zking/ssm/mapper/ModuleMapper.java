package com.zking.ssm.mapper;

import com.zking.ssm.model.Module;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ModuleMapper {
    int insert(Module record);

    int insertSelective(Module record);
    List<Module> queryModuleTree(Module module);
}