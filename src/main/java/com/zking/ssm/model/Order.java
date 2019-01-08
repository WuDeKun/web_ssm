package com.zking.ssm.model;

public class Order {
    private Integer order_id;

    private String order_no;

    private Integer cid;

    public Order(Integer order_id, String order_no, Integer cid) {
        this.order_id = order_id;
        this.order_no = order_no;
        this.cid = cid;
    }

    public Order() {
        super();
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}