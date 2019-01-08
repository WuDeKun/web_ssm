package com.zking.ssm.service.imp;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Module;
import com.zking.ssm.service.ICustomerService;
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

    @Autowired
    private ICustomerService ICustomerService;
    @Before
    public void setUp()  {
        super.setUp();
    }

    @Test
    public void queryModuleTree() {
//        module.setPid("-1");
        List<Module> maps = IModuleService.queryModuleTree(module);
        for (Module m:
                maps) {
            System.out.println(m);
        }
    }
    @Test
    public void selectByPrimaryKey() {
//        module.setPid("-1");
        Customer maps = ICustomerService.selectByPrimaryKey(1);
        System.out.println(maps);

        List<Customer> list = ICustomerService.list();
        for (Customer s:
             list) {
            System.out.println(s);
        }
    }
}