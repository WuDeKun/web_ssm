package com.zking.ssm.mapper;

import com.zking.ssm.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer order_id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer order_id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}