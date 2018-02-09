package com.example.demo.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * Created by zhanghualong on 2017/11/27.
 */
public class DemoUtils {

	
    public static void main(String[] args) throws Exception{
        List<String> linked_list=new LinkedList<>();
        System.out.println(linked_list.toString());
        linked_list.add("123");
        System.out.println();
        
        SpringFactoriesLoader a=null;
        ConfigFileApplicationListener aa=null;
    }

}
