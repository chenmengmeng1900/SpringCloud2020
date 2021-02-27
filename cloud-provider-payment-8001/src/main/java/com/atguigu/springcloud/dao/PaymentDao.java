package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ChenMeng on 2021/2/27 23:39
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment); //这里一般都是add,save,create,这里是写操作
    public Payment getPaymentById(@Param("id") Long id);
}
