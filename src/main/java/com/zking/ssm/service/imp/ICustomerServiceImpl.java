package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }

    @Override
    public List<Customer> list() {
        return customerMapper.list();
    }
}
