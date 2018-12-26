package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.ModuleMapper;
import com.zking.ssm.model.Module;
import com.zking.ssm.service.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class IModuleServiceImpl implements IModuleService {

    @Autowired
    private ModuleMapper moduleMapper;
    @Transactional
    @Override
    public int insert(Module record) {
        return moduleMapper.insert(record);
    }
    @Transactional
    @Override
    public int insertSelective(Module record) {
        return moduleMapper.insertSelective(record);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Map<String, Object>> queryModuleTree(Module module) {
        return moduleMapper.queryModuleTree(module);
    }
}
