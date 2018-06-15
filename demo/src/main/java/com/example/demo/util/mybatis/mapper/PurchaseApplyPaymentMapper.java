package com.example.demo.util.mybatis.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseApplyPaymentMapper {
    long countByExample(PurchaseApplyPaymentExample example);

    int deleteByExample(PurchaseApplyPaymentExample example);

    int deleteByPrimaryKey(Integer PKID);

    int insert(PurchaseApplyPayment record);

    int insertSelective(PurchaseApplyPayment record);

    List<PurchaseApplyPayment> selectByExample(PurchaseApplyPaymentExample example);

    PurchaseApplyPayment selectByPrimaryKey(Integer PKID);

    int updateByExampleSelective(@Param("record") PurchaseApplyPayment record, @Param("example") PurchaseApplyPaymentExample example);

    int updateByExample(@Param("record") PurchaseApplyPayment record, @Param("example") PurchaseApplyPaymentExample example);

    int updateByPrimaryKeySelective(PurchaseApplyPayment record);

    int updateByPrimaryKey(PurchaseApplyPayment record);
}