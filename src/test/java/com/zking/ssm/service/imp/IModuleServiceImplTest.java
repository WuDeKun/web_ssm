package com.zking.ssm.service.imp;

import com.zking.ssm.model.Module;
import com.zking.ssm.service.IModuleService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class IModuleServiceImplTest extends BaseTextCode{

    @Autowired
    private IModuleService IModuleService;
    @Before
    public void setUp()  {
        super.setUp();
    }

    @Test
    public void queryModuleTree() {
//        module.setPid("-1");
        List<Map<String, Object>> maps = IModuleService.queryModuleTree(module);
        for (Map<String, Object> m:
                maps) {
            System.out.println(m);
        }
    }
}