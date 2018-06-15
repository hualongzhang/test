package com.example.demo.util.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.util.mybatis.mapper.Blog;
import com.example.demo.util.mybatis.mapper.BlogMapper;
import com.example.demo.util.mybatis.mapper.PurchaseApplyPaymentMapper;

public class DeomTest {

	public static void main(String[] args) throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PurchaseApplyPaymentMapper mapper=session.getMapper(PurchaseApplyPaymentMapper.class);
			System.out.println(mapper.toString());
			mapper.selectByPrimaryKey(123);
		} finally {
		  session.close();
		}
	}
}
