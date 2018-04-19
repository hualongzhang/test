package com.example.demo.util.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.util.mybatis.mapper.Blog;
import com.example.demo.util.mybatis.mapper.BlogMapper;

public class DeomTest {

	public static void main(String[] args) throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			BlogMapper mapper=session.getMapper(BlogMapper.class);
			Blog blog=mapper.selectBlog("name1");
			System.out.println(blog.toString()+"=="+blog.getName());
		} finally {
		  session.close();
		}
	}
}
