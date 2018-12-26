package com.zking.ssm.service.imp;

import com.zking.ssm.model.Module;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTextCode {
    protected Module module;
    public void setUp(){
        module=new Module();
    }
}
